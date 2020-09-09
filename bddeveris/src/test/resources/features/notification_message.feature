@notificationMessage
Feature: Mensagem de notificação

	Scenario: Verificar se uma mensagem é exibida
		Given que eu ingresso na tela Notification Message
		When eu clico no link para carregar a mensagem
		Then eu verifico se a mensagem "Action unsuccesful, please try again" é exibida
		When eu clico no botão para fechar a mensagem
		When eu clico no link para carregar a mensagem
		Then eu verifico se a mensagem "Action Succesful" é exibida