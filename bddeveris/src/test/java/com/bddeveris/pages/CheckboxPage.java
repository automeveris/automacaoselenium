package com.bddeveris.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bddeveris.runner.ClassInit;

public class CheckboxPage {
	
	WebDriver driver;
	
	//Values
	String _cbx_checkbox1 = "//input[@type='checkbox'][1]";
	String _flg_checkbox1 = "//input[@checked]/following-sibling::br";
	
	
	public CheckboxPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openUrl(String url) {
		this.driver = ClassInit.driver;
		this.driver.get(url);
	}
	
	public void clickCheck1() throws InterruptedException {
		WebElement element = this.driver.findElement(By.xpath(_cbx_checkbox1));
		Thread.sleep(1500);
		element.click();
		Thread.sleep(1500);
	}
	
	public void verifyCheck() {
		WebElement element = this.driver.findElement(By.xpath(_flg_checkbox1));
		Assert.assertTrue(element.isEnabled());
	}
}
