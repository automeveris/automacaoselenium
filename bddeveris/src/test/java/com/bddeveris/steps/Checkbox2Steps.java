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
	WebElement cbx1;
	
	//values
	String _cbx_check1 = "//form[@id='checkboxes']/input[1]";
	
	
	@Given("que eu ingresso na tela de checkbox")
	public void eu_quando_na_tela_de_checkbox() {
		this.driver = ClassInit.driver;
		this.driver.get("https://the-internet.herokuapp.com/checkboxes");
	}

	@When("eu clico o checkbox1")
	public void eu_clico_o_checkbox1() throws InterruptedException {
		this.cbx1 = this.driver.findElement(By.xpath(_cbx_check1));
		cbx1.click();
		Thread.sleep(1500);
	}

	@Then("eu vejo o checkbox1 selecionado teste")
	public void eu_vejo_o_checkbox1_selecionado_teste() throws InterruptedException {
		if (this.cbx1.getAttribute("checked") == null) {
			this.cbx1.click();
			Thread.sleep(1500);
			Assert.assertTrue(false);
		} else {
			System.out.println("Checkbox selecionado");
			Assert.assertTrue(true);
		}
	}


}
