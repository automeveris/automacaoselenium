@alerts
Feature: Alerts JS

	Background: Ingressar na tela
	 	Given que eu ingresso na tela de alertas JS

  @js1
  Scenario: Verificar OK JS alerta
  	When eu seleciono a opcao JS alert
  	And eu pressiono o botão ok
  	Then eu vejo a mensagem "You successfuly clicked an alert"
  
  @js5
  Scenario Outline: Verficar alert confirm
  	When eu seleciono a opcao JS confirm
  	And eu pressiono o botão <opcao>
  	Then eu vejo a mensagem <resultado>
  	
  	Examples:
  	|opcao|resultado|
  	|"ok"|"You clicked: Ok"|
  	|"cancel"|"You clicked: Cancel"|
  	
  
  @js4
  Scenario: Verificar nome ao preencher JS prompt
  	When eu seleciono a opcao JS prompt
  	And eu preencho o nome "selenium"
  	And eu pressiono o botão ok
  	Then eu vejo a mensagem "You entered: selenium"