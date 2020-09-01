@formAuthentication
Feature: Formulário de autenticação

	Background: Ingressar na tela
	 	Given que eu ingresso na url "https://the-internet.herokuapp.com/login"
	
	Scenario Outline: Realizar um login
		When eu insiro o texto <usuario> no campo com id "username"
		When eu insiro o texto <senha> no campo com id "password"
		When eu clico no botão que contém o texto "Login"
		Then eu verifico se a mensagem <mensagem> é exibida
		
		Examples:
	  	|usuario	|senha					|mensagem							|
	  	|"tomsmith"	|"SuperSecretPassword!"	|"You logged into a secure area!"	|
	  	|"teste"	|"SuperSecretPassword!"	|"Your username is invalid!"		|
		|"tomsmith"	|"teste"				|"Your password is invalid!"		|
