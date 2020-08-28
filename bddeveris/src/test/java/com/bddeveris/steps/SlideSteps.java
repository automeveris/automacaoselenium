package com.bddeveris.steps;

import org.openqa.selenium.WebDriver;
import com.bddeveris.pages.SlidePage;
import com.bddeveris.runner.ClassInit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SlideSteps {

	WebDriver driver;
	SlidePage page;
	
	@Given("eu ingresso na tela de slide")
	public void eu_ingresso_na_tela_de_slide() throws InterruptedException {
		page = new SlidePage(ClassInit.driver);
		page.openUrl("https://the-internet.herokuapp.com/horizontal_slider");
		Thread.sleep(2000);
	}

	@When("eu movimento o slide até o maximo")
	public void eu_movimento_o_slide_até_o_maximo() throws InterruptedException {
		page.movimentarSlide();
		Thread.sleep(2000);
	}

	@Then("eu vejo o valor de {string}")
	public void eu_vejo_o_valor_de(String resultadoEsperado) throws InterruptedException {
		page.verificarResultado(resultadoEsperado);
		Thread.sleep(2000);
	}
	
}
