package com.bddeveris.steps;

import org.openqa.selenium.WebDriver;
import com.bddeveris.pages.FormPage;
import com.bddeveris.runner.ClassInit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FormSteps {
	
	WebDriver driver;
	FormPage page;
	
	

	@Given("que eu ingresso na tela de login page")
	public void que_eu_ingresso_na_tela_de_login_page() throws InterruptedException {
		page = new FormPage(ClassInit.driver);
		page.openUrl("https://the-internet.herokuapp.com/login");
	}

	@When("eu preencho o campo usuario {string}")
	public void eu_preencho_o_campo_usuario(String user) throws InterruptedException {
		page.preencherUsuario(user);
	}

	@When("eu preencho o campo password {string}")
	public void eu_preencho_o_campo_password(String password) throws InterruptedException {
		page.preencherPassword(password);
	}
	
	@When("eu pressiono login")
	public void eu_pressiono_login() throws InterruptedException {
		page.pressionarLogin();
	}

	@Then("eu verifico que ingressa na home")
	public void eu_verifico_que_ingressa_na_home() throws InterruptedException {
		page.verificarUrl("https://the-internet.herokuapp.com/secure");
	}

	@Then("eu verifico a mensagem de alerta {string}")
	public void eu_verifico_a_mensagem_de_sucesso(String alerta) throws InterruptedException {
		page.verficarMensagemAlerta(alerta);
	}
	
}
