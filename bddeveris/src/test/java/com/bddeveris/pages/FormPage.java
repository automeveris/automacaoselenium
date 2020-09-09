package com.bddeveris.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.bddeveris.utils.MethodsUtils;


public class FormPage {
	
	WebDriver driver;
	MethodsUtils mu;
	
	//Values
	String _txtUser = "//input[@id='username']";
	String _txtPassword = "//input[@id='password']";
	String _altResult = "//div[@id='flash']";
	String _btnLogin = "//button[@type='submit']";
	String _btnLogout = "//a[@href='/logout']";
			
	
	//Construtor para poder usar o objeto driver 
	public FormPage(WebDriver driver){
		this.driver = driver;
		this.mu = new MethodsUtils(driver);
	}
	
	
	//Metodo abrir url
	public void openUrl(String url) {
		this.driver.get(url);
	}
	
	
	public void preencherUsuario(String user) throws InterruptedException {
		
		this.mu.enviarMensagem("xpath",_txtUser, user);
		
	}

	public void preencherPassword(String password) throws InterruptedException {
	
		
		this.mu.enviarMensagem("xpath",_txtPassword, password);
	
	}
	
	public void pressionarLogin() throws InterruptedException {
		
		this.mu.clicarElemento("xpath", _btnLogin);
	}
	
	
	public void verificarUrl(String urlEsperada) {
		Assert.assertEquals(urlEsperada,this.driver.getCurrentUrl());
	}
	
	
	public void verficarMensagemAlerta(String altEsperado) {
		String rAlerta = this.driver.findElement(By.xpath(_altResult)).getText();
		Assert.assertTrue(rAlerta.contains(altEsperado));
	}
	
}
