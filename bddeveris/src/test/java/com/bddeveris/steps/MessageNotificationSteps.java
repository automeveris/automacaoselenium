package com.bddeveris.steps;

import org.openqa.selenium.WebDriver;

import com.bddeveris.pages.MessageNotificationPage;
import com.bddeveris.runner.ClassInit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class MessageNotificationSteps {
	
	WebDriver driver;
	MessageNotificationPage page;

	@Given("que eu ingresso na tela Notification Message")
	public void que_eu_ingresso_na_tela_Notification_Message() {
		page = new MessageNotificationPage(ClassInit.driver);
		page.openUrl("https://the-internet.herokuapp.com/notification_message_rendered");
	}

	@When("eu clico no link para carregar a mensagem")
	public void eu_clico_no_link_para_carregar_a_mensagem() {
		page.clickHere().click();
	}

	@When("eu clico no botão para fechar a mensagem")
	public void eu_clico_no_botão_para_fechar_a_mensagem() {
		page.closeMessage();
	}


}
