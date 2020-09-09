package com.bddeveris.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bddeveris.utils.MethodsUtils;

public class JSAlertsPage {
	
	WebDriver driver;
	Alert altPrompt;
	MethodsUtils mu;
	
	//Values
	String _btnAlert = "//button[.='Click for JS Alert']";
	String _btnConfirm = "//button[.='Click for JS Confirm']";
	String _btnPrompt = "//button[.='Click for JS Prompt']";
	String _msgAlert = "//p[@id='result']";
	
	
	
	//Construtor para poder usar o objeto driver 
	public JSAlertsPage(WebDriver driver){
		this.driver = driver;
		this.mu = new MethodsUtils(driver);
	}
	
	
	//Metodo abrir url
	public void openUrl(String url) {
		this.driver.get(url);
	}
	

	//JS Alert: Pressionar OK-------------Cenário 1---------------------------------
	public void opcaoJSAlert() throws InterruptedException {
		this.mu.clicarElemento("xpath", _btnAlert);
	}

	
	public void aceitarJSAlert() {
		
		Alert jsAlert = this.driver.switchTo().alert();
		jsAlert.accept();
	}
	//------------------------------------------------------------------------------
	
	
	
	//Alert Confirm: OK e Cancel-----------Cenário 2 e 3-------------------------------
	public void opcaoJSConfirm() {
		WebElement btnAlert = this.driver.findElement(By.xpath(_btnConfirm));
		btnAlert.click();
	}
	
	public void cancelarJSAlert() {
		Alert jsAlert = this.driver.switchTo().alert();
		jsAlert.dismiss();
	}
	//-------------------------------------------------------------------------

	
	
	//Alert Prompt: Preencher dados e pressionar OK--------Cenário 4------------
	public void opcaoJSPrompt() {
		WebElement btnAlert = this.driver.findElement(By.xpath(_btnPrompt));
		btnAlert.click();
	}
	
	public void preencherJSPrompt(String mensagem) {
		altPrompt = this.driver.switchTo().alert();
		altPrompt.sendKeys(mensagem);
	}
			
	//-------------------------------------------------------------------------
	

	
	//Metodo para verificar resultado depois de aceitar ou cancelar
	public void verificarResultado(String resultEsperado) {
		String resultAtual = this.driver.findElement(By.xpath(_msgAlert)).getText();
		Assert.assertEquals(resultAtual,resultEsperado);
	}
}
