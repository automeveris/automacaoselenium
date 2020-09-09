@dynamic
Feature: Dynamic Controls
  
  Background: Ingressar na tela de dynamic controls
  	Given que eu ingresso na url "https://the-internet.herokuapp.com/dynamic_controls"
  
  @d1
  Scenario: Remove o elemento checkbox
  	When eu clico no checkbox
  	And eu pressiono o botao remove
		Then eu verifico que o checkbox não se mostre na tela
		And eu vejo a mensagem no resultado "It's gone!"

	@d2
  Scenario: Adicionar o elemento checkbox
  	When eu clico no checkbox
  	And eu pressiono o botao remove
  	And eu pressiono o botão add
		Then eu verifico que o checkbox se mostre na tela
		And eu vejo a mensagem no resultado "It's back!"
		
		
	@d3
  Scenario: Habilitar o elemento texto 
  	When eu clico no botao enable
		Then eu verifico que mostra habilitado para preencher o campo texto
		And eu vejo a mensagem no resultado "It's enabled!"

	@d4
  Scenario: Deshabilitar o elemento texto
  	When eu clico no botao enable
  	And  eu clico no botao disable
		Then eu verifico que não mostra habilitado para preencher o campo texto
		And eu vejo a mensagem no resultado "It's disabled!"