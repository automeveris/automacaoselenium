package com.bddeveris.steps;

import org.openqa.selenium.WebDriver;
import com.bddeveris.pages.JSAlertsPage;
import com.bddeveris.runner.ClassInit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class JSAlertsSteps {
	
	WebDriver driver;
	JSAlertsPage jsp;

	
	@Given("que eu ingresso na tela de alertas JS")
	public void que_eu_ingresso_na_tela_de_alertas_JS() {
		jsp = new JSAlertsPage(ClassInit.driver);
		jsp.openUrl("https://the-internet.herokuapp.com/javascript_alerts");
	}

	
	//Cenario1------------
	@When("eu seleciono a opcao JS alert")
	public void eu_pressiono_o_botão_JS_alert() throws InterruptedException {
		jsp.opcaoJSAlert();
	}

	@When("eu pressiono o botão ok")
	public void eu_pressiono_o_botão_ok() throws InterruptedException {
		jsp.aceitarJSAlert();
	}
	//-------------------
	
	
	//Metodo repetido em todos os cenários
	@Then("eu vejo a mensagem {string}")
	public void eu_vejo_a_mensagem(String resultEsperado) throws InterruptedException {
		jsp.verificarResultado(resultEsperado);
	}

	
	//Cenario2 e 3------------
	@When("eu seleciono a opcao JS confirm")
	public void eu_pressiono_o_botão_JS_confirm() throws InterruptedException {
		jsp.opcaoJSConfirm();
	}

	@When("eu pressiono o botão cancel")
	public void eu_pressiono_o_botão_cancel() throws InterruptedException {
		jsp.cancelarJSAlert();
		Thread.sleep(2000);
	}
	//-------------------
	
	
	//Cenario4------------
	@When("eu seleciono a opcao JS prompt")
	public void eu_pressiono_o_botão_JS_prompt() throws InterruptedException {
		jsp.opcaoJSPrompt();
		Thread.sleep(2000);
	}

	@When("eu preencho o nome {string}")
	public void eu_preencho_o_nome(String mensagem) throws InterruptedException {
		jsp.preencherJSPrompt(mensagem);
		Thread.sleep(2000);
	}
	//-------------------

	
	@When("eu pressiono o botão {string}")
	public void eu_pressiono_o_botão(String opcao) {
		if (opcao.contains("ok")) {
			jsp.aceitarJSAlert();
		}else 
		{
			jsp.cancelarJSAlert();
		}
	}

}
