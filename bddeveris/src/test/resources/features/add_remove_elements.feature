@addRemoveElements
Feature: Adicionar e remover elementos

	Scenario: Verificar se um elemento está presente
		Given que eu ingresso na tela Add Remove Elements
		Then eu verifico se não existe o botão Delete
		When eu clico no botão Add Element
		Then eu verifico se o botão Delete é mostrado na tela
		When eu clico no botão Add Element
		When eu clico no botão Delete
		When eu clico no botão Delete
		