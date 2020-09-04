package com.bddeveris.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MethodsUtils {
	
	WebDriver driver;
	WebElement elem;
	
	
	public MethodsUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(String type, String value) throws InterruptedException{
		try {
			type = type.toLowerCase();
			if(type == "xpath") {
				elem = this.driver.findElement(By.xpath(value));
				System.out.println("Elemento encontrado");
				Thread.sleep(2000);
			}
			return elem;
		} 
		catch( Exception e)
		{
			System.out.println("Elemento não foi encontrado");
			return elem;
		}
		
	}
	
	public void clicarElemento(String type, String value) throws InterruptedException {
		try{
			elem = getElement(type, value);
			elem.click();
			System.out.println("Elemento clicado com sucesso");
			Thread.sleep(2000);
		} 
		catch( Exception e)
		{
			System.out.println("Não foi possivel clicar no elemento");
		}
	}
	
	public void enviarMensagem(String type, String value, String mensagem) throws InterruptedException {
		try {
			elem = getElement(type, value);
			elem.sendKeys(mensagem);
			System.out.println("Mensagem foi enviado com sucesso");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("Não foi possivel enviar a mensagem");
		}
	}
}
