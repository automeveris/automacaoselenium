package com.bddeveris.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.bddeveris.pages.AddRemoveElements;
import com.bddeveris.pages.HorizontalSlider;
import com.bddeveris.runner.ClassInit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HorizontalSliderSteps {
	
	WebDriver driver;
	HorizontalSlider page;

	@Given("que eu ingresso na tela do horizontal slider")
	public void que_eu_ingresso_na_tela_do_horizontal_slider() {
		page = new HorizontalSlider(ClassInit.driver);
		page.openUrl("https://the-internet.herokuapp.com/add_remove_elements/");
	}

	@When("^eu movimento o slider utilizando o valor \"([^\"]*)\"$")
	public void eu_movimento_o_slider_utilizando_o_valor(Integer valor) {
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(page.slider(), 10, 0).build();
        action.perform();
	}
	
	
	@Then("eu vejo o valor {string} na tela")
	public void eu_vejo_o_valor_na_tela(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}