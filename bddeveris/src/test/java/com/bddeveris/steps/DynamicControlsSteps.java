package com.bddeveris.steps;

import org.openqa.selenium.WebDriver;
import com.bddeveris.pages.DynamicControlsPage;
import com.bddeveris.runner.ClassInit;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicControlsSteps {
	
	WebDriver driver;
	DynamicControlsPage page = new DynamicControlsPage(ClassInit.driver);
	
	@When("eu clico no checkbox")
	public void eu_clico_no_checkbox() throws InterruptedException {
		page.clicarCheckBox();
	}

	@When("eu pressiono o botao remove")
	public void eu_pressiono_o_botao_remove() throws InterruptedException {
		page.clicarBotaoAddRemove();
	}

	@Then("eu verifico que o checkbox não se mostre na tela")
	public void eu_verifico_que_o_checkbox_não_se_mostre_na_tela() throws InterruptedException {
		page.verificarInvisibilidadeCheckBox();
	}

	@When("eu pressiono o botão add")
	public void eu_pressiono_o_botão_add() throws InterruptedException {
		page.clicarBotaoAddRemove();
	}

	@Then("eu verifico que o checkbox se mostre na tela")
	public void eu_verifico_que_o_checkbox_se_mostre_na_tela() throws InterruptedException {
		page.verificarVisibilidadeCheckBox();
	}
	
	@Then("eu vejo a mensagem no resultado {string}")
	public void eu_vejo_a_mensagem_no_resultado(String mensagem) throws InterruptedException {
		page.verificarMensagem(mensagem);
	}

	@When("eu clico no botao enable")
	public void eu_clico_no_botao_enable() throws InterruptedException {
		page.clicarBotaoEnableDisable();
	}

	@Then("eu verifico que mostra habilitado para preencher o campo texto")
	public void eu_verifico_que_mostra_habilitado_para_preencher_o_campo_texto() throws InterruptedException {
		page.verificarClickText();
	}

	@When("eu clico no botao disable")
	public void eu_clico_no_botao_disable() throws InterruptedException {
		page.clicarBotaoEnableDisable();
	}

	@Then("eu verifico que não mostra habilitado para preencher o campo texto")
	public void eu_verifico_que_não_mostra_habilitado_para_preencher_o_campo_texto() throws InterruptedException {
		page.verificarClickText();
	}

}
