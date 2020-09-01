package com.bddeveris.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bddeveris.pages.CommonPage;
import com.bddeveris.runner.ClassInit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CommonSteps {
	
	WebDriver driver;
	CommonPage page;
	WebDriverWait wait = new WebDriverWait(ClassInit.driver, 10);

	@Given("que eu ingresso na url {string}")
	public void que_eu_ingresso_na_tela(String url) {
		page = new CommonPage(ClassInit.driver);
		page.openUrl(url);
	}

	@Then("eu verifico se a mensagem {string} é exibida")
	public void eu_verifico_se_a_mensagem_é_exibida(String expected) {
		waitElementVisibility(page.notificationText());
		String actual = page.notificationText().getText();
		actual = actual.replace("\n" + "×", "");
		Assert.assertEquals("Era esperada a mensagem: "+expected+" e foi encontrado: "+actual, expected, actual);
	}

	@When("eu insiro o texto {string} no campo com id {string}")
	public void eu_insiro_o_texto_no_campo_com_id(String text, String id) {
		page.inputById(id).sendKeys(text);
	}

	@When("eu clico no botão que contém o texto {string}")
	public void eu_clico_no_botão_que_contém_o_texto(String text) {
		page.buttonByText(text).click();
	}

	  public void waitElementBeClickable(WebElement element) {
	 	wait.until(ExpectedConditions.elementToBeClickable(element));
	 }

	  public void waitElementVisibility(WebElement element) {
		  wait.until(ExpectedConditions.visibilityOf(element));
	  }
	 	 
}
