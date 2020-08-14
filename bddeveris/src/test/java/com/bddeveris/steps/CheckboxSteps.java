package com.bddeveris.steps;

import org.openqa.selenium.WebDriver;
import com.bddeveris.pages.CheckboxPage;
import com.bddeveris.runner.ClassInit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CheckboxSteps {
	
	WebDriver driver;
	CheckboxPage cbp;

	
	@Given("eu ingresso na tela")
	public void eu_ingresso_na_tela() {
		cbp = new CheckboxPage(ClassInit.driver);
		cbp.openUrl("https://the-internet.herokuapp.com/checkboxes");
	}

	@When("eu pressiono o checkbox1")
	public void eu_pressiono_o_checkbox1() throws InterruptedException {
		cbp.clickCheck1();
	}

	@Then("eu vejo o checkbox1 selecionado")
	public void eu_vejo_o_checkbox1_selecionado() {
		cbp.verifyCheck();
	}
	
}
