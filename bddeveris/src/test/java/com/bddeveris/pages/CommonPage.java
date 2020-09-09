package com.bddeveris.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bddeveris.runner.ClassInit;

public class CommonPage {

	WebDriver driver;
		
	public CommonPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openUrl(String url) {
		this.driver = ClassInit.driver;
		this.driver.get(url);
	}
	
	public WebElement buttonByText(String text) {
		return this.driver.findElement(By.xpath("//button[contains(.,'"+text+"')]"));
	}
	
	public WebElement inputById(String id) {
		return this.driver.findElement(By.id(id));
	}
	
	public WebElement notificationText() {
		return this.driver.findElement(By.id("flash"));
	}

}
