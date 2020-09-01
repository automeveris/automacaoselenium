package com.bddeveris.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.bddeveris.pages.AddRemoveElements;
import com.bddeveris.pages.MessageNotificationPage;
import com.bddeveris.runner.ClassInit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MessageNotificationSteps {
	
	WebDriver driver;
	MessageNotificationPage page;

	@Given("que eu ingresso na tela Notification Message")
	public void que_eu_ingresso_na_tela_Notification_Message() {
		page = new MessageNotificationPage(ClassInit.driver);
		page.openUrl("https://the-internet.herokuapp.com/notification_message_rendered");
	}

	/*
	 * @Then("eu verifico se a mensagem {string} é exibida") public void
	 * eu_verifico_se_a_mensagem_é_exibida(String expected) { String actual =
	 * page.notificationText().getText(); actual = actual.replace("\n" + "×", "");
	 * Assert.assertEquals("Era esperada a mensagem: "
	 * +expected+" e foi encontrado: "+actual, expected, actual); }
	 */

	@When("eu clico no link para carregar a mensagem")
	public void eu_clico_no_link_para_carregar_a_mensagem() {
		page.clickHere().click();
	}

	@When("eu clico no botão para fechar a mensagem")
	public void eu_clico_no_botão_para_fechar_a_mensagem() {
		page.closeMessage();
	}


}
