package com.bddeveris.steps;

import org.openqa.selenium.WebDriver;

import com.bddeveris.pages.DropDown;
import com.bddeveris.runner.ClassInit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DropDownSteps {
	
	WebDriver driver;
	DropDown drp;

	@Given("que eu ingresso na tela do dropdown")
	public void que_eu_ingresso_na_tela_do_dropdown() {
		drp = new DropDown(ClassInit.driver);
		drp.openUrl("https://the-internet.herokuapp.com/dropdown");
	}

	@When("^eu seleciono a opção utilizando o texto \"([^\"]*)\"$")
	public void eu_seleciono_a_opção_utilizando_valor(String texto) throws InterruptedException {
		Thread.sleep(1500);
		drp.selectByText(texto);
		Thread.sleep(1500);
	}

	@When("^eu seleciono a opção utilizando o valor \"([^\"]*)\"$")
	public void eu_seleciono_a_opção_utilizando_texto(String valor) throws InterruptedException {
		Thread.sleep(1500);
		drp.selectByValue(valor);
		Thread.sleep(1500);
	}

	@When("^eu seleciono a opção utilizando o índice \"([^\"]*)\"$")
	public void eu_seleciono_a_opção_utilizando_índice(int indice) throws InterruptedException {
		Thread.sleep(1500);
		drp.selectByIndex(indice);
		Thread.sleep(1500);
	}
	
	@Then("^eu vejo a opção \"([^\"]*)\" selecionada na tela")
	public void eu_vejo_a_opção_selecionada_na_tela(String expected) throws Exception {
		String actual = drp.valueSelected();
		if(actual.equals(expected)) {
			System.out.println("A opção selecionada é: " + expected);
		}else {
			throw new Exception("Era esperada a opção: "+expected+" e foi encontrada: "+actual);
		}		
	}

}
