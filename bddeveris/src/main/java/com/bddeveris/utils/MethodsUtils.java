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
		type = type.toLowerCase();
		if(type == "xpath") {
			elem = this.driver.findElement(By.xpath(value));
			System.out.println("Elemento encontrado");
			Thread.sleep(2000);
		}
		return elem;
	}
	
	public void clicarElemento(String type, String value) throws InterruptedException {
		elem = getElement(type, value);
		elem.click();
		System.out.println("Elemento clicado com sucesso");
		Thread.sleep(2000);
	}
}
