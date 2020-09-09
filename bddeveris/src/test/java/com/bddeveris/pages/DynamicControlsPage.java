package com.bddeveris.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bddeveris.utils.MethodsUtils;


public class DynamicControlsPage {
	
	WebDriver driver;
	MethodsUtils mu;
	
	
	//Values
	String _cbx1 = "//input[@type='checkbox']";
	String _btnAR = "//form[@id='checkbox-example']/button";
	String _altResult = "//p[@id='message']";
	String _txtED = "//input[@type='text']";
	String _btnED = "//form[@id='input-example']/button";
	
	
	public DynamicControlsPage(WebDriver driver){
		this.driver = driver;
		this.mu = new MethodsUtils(driver);
	}

	
	public void clicarCheckBox() throws InterruptedException {
		mu.clicarElemento("xpath", _cbx1);
	}
	
	public void clicarBotaoAddRemove() throws InterruptedException {
		mu.clicarElemento("xpath", _btnAR);
	}
	
	public void clicarBotaoEnableDisable() throws InterruptedException {
		mu.clicarElemento("xpath", _btnED);
	}
	
	
	public void verificarClickText() throws InterruptedException {
		WebElement eText = mu.getElement("xpath", _txtED);
		new WebDriverWait(this.driver, 15).until(ExpectedConditions.elementToBeClickable(eText));
	}

	
	
	public void verificarInvisibilidadeCheckBox() throws InterruptedException {
		try{
			WebElement eCheckBox = mu.getElement("xpath", _cbx1);
			new WebDriverWait(this.driver, 15).until(ExpectedConditions.invisibilityOf(eCheckBox));
			}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			   System.out.println("CheckBox Não se mostra na tela");
			}
	}
	
	
	
	public void verificarVisibilidadeCheckBox() throws InterruptedException {
		try{
			WebElement eCheckBox = mu.getElement("xpath", _cbx1);
			new WebDriverWait(this.driver, 15).until(ExpectedConditions.visibilityOf(eCheckBox));
			}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
			   System.out.println("CheckBox se mostra na tela");
			}
	}
	
	
	public void verificarMensagem(String msg) throws InterruptedException {
		String msgResult = mu.getElement("xpath", _altResult).getText();
		Assert.assertEquals(msg, msgResult);
	}
	
}
