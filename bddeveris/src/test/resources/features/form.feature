@form
Feature: Login Page

	Background: Ingresso na tela
		Given que eu ingresso na tela de login page

  @f1
  Scenario: Login com sucesso
		When eu preencho o campo usuario "tomsmith"
  	And eu preencho o campo password "SuperSecretPassword!"
  	And eu pressiono login
  	Then eu verifico que ingressa na home
  	And eu verifico a mensagem de alerta "You logged into a secure area!"
		
  @f2
  Scenario Outline: Login com erro
		When eu preencho o campo usuario <usuario>
  	And eu preencho o campo password <password>
  	And eu pressiono login
  	Then eu verifico a mensagem de alerta "Your username is invalid"
  	
  	Examples:
  	|usuario|password|
  	|"uIncorreto"|"pIncorreto"|
  	|"uIncorreto"|		""			|
  	|			""		 |"pIncorreto"|
  	|			""		 |		""			|