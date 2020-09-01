package com.bddeveris.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bddeveris.runner.ClassInit;

public class MessageNotificationPage {

	WebDriver driver;
	
	public MessageNotificationPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openUrl(String url) {
		this.driver = ClassInit.driver;
		this.driver.get(url);
	}
	
	public WebElement clickHere() {
		return this.driver.findElement(By.partialLinkText("Click"));
	}

	public WebElement closeMessage() {
		return this.driver.findElement(By.xpath("//a[@class='close']"));
	}
	
	public WebElement notificationText() {
		return this.driver.findElement(By.id("flash"));
	}

}
