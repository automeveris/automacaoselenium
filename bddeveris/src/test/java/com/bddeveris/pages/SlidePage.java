package com.bddeveris.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import com.bddeveris.utils.MethodsUtils;



public class SlidePage {
	
	WebDriver driver;
	MethodsUtils mu;
	
	//Values
	String _slide = "//input[@type='range']";
	String _msgSlide = "//span[@id='range']";
	
	
	
	//Construtor para poder usar o objeto driver 
	public SlidePage(WebDriver driver){
		this.driver = driver;
		this.mu = new MethodsUtils(driver);
	}
	
	
	//Metodo abrir url
	public void openUrl(String url) {
		this.driver.get(url);
	}
	
	public void movimentarSlide() {       
        WebElement slider = this.driver.findElement(By.xpath(_slide));
        Actions move = new Actions(this.driver);
        Action action = (Action) move.dragAndDropBy(slider,45,0).build();    
        action.perform();
	}

	
	public void verificarResultado(String rEsperado) {
		String rAtual = this.driver.findElement(By.xpath(_msgSlide)).getText();
		Assert.assertEquals(rEsperado,rAtual);
	}

}
