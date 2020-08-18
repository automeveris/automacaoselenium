@login
Feature: Authenticate
	
	Scenario: Login com sucesso
		Given eu ingresso na tela de login
		When eu preencho os meus dados de acesso
		Then eu vejo a mensagem de acesso com sucesso