package com.bddeveris.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.bddeveris.pages.AddRemoveElements;
import com.bddeveris.pages.DropDown;
import com.bddeveris.runner.ClassInit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddRemoveElementsSteps {
	
	WebDriver driver;
	AddRemoveElements page;

	@Given("que eu ingresso na tela Add Remove Elements")
	public void que_eu_ingresso_na_tela_Add_Remove_Elements() {
		page = new AddRemoveElements(ClassInit.driver);
		page.openUrl("https://the-internet.herokuapp.com/add_remove_elements/");
	}

	@Then("eu verifico se não existe o botão Delete")
	public void eu_verifico_se_não_existe_o_botão_Delete() throws InterruptedException {
		if(page.deleteButtons().size()>0) {
			System.out.println("O elemento é existe na tela");
		}else {
			System.out.println("O elemento não existe na tela");
		}
		Thread.sleep(2000);
		Assert.assertTrue(page.deleteButtons().size()==0);
	}

	@When("eu clico no botão Add Element")
	public void eu_clico_no_botão_Add_Element() throws InterruptedException {
		page.addElementButton().click();
		System.out.println("Clico no Botão Add Element");
		Thread.sleep(2000);
	}

	@Then("eu verifico se o botão Delete é mostrado na tela")
	public void eu_verifico_se_o_botão_Delete_eh_mostrado_na_tela() throws InterruptedException {
		if(page.deleteButton().isDisplayed()) {
			System.out.println("O elemento é mostrado na tela");
		}else {
			System.out.println("O elemento não é mostrado na tela");
		}
		Thread.sleep(2000);
		Assert.assertTrue(page.deleteButton().isDisplayed());
	}
	
	@When("eu clico no botão Delete")
	public void eu_clico_no_botão_Delete() throws InterruptedException {
		page.deleteButton().click();
		System.out.println("Clico no Botão Delete");
		Thread.sleep(2000);
	}

}
