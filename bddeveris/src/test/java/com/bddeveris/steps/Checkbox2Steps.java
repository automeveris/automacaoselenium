package com.bddeveris.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bddeveris.runner.ClassInit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkbox2Steps {

	WebDriver driver;
	
	@Given("que eu ingresso na tela de checkbox")
	public void eu_quando_ingresso_na_tela_de_checkbox() {
	    this.driver = ClassInit.driver;
	    this.driver.get("https://the-internet.herokuapp.com/checkboxes");
	    throw new io.cucumber.java.PendingException();
	}

	@When("eu clico no checkbox1")
	public void eu_clico_no_checkbox1() throws InterruptedException {
	    WebElement cbx1 = this.driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
	    Thread.sleep(1500);
	    cbx1.click();
	    Thread.sleep(1500);
	}

	@Then("eu vejo o checkbox1 selecionado na tela")
	public void eu_vejo_o_checkbox1_selecionado_na_tela() {
		WebElement cbx1 = this.driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		if(cbx1.getAttribute("checked") == null){
			cbx1.click();
		} else {
			Assert.assertTrue(false);
			System.out.println("Elemento clicado");
		}
	}
	
}
