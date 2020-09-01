package com.bddeveris.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bddeveris.runner.ClassInit;

public class HorizontalSlider {
	
	WebDriver driver;
	
	public HorizontalSlider(WebDriver driver){
		this.driver = driver;
	}
	
	public void openUrl(String url) {
		this.driver = ClassInit.driver;
		this.driver.get(url);
	}
	
	public WebElement slider() {
		WebElement element = this.driver.findElement(By.xpath("//input"));
		return element;
	}
	
}
