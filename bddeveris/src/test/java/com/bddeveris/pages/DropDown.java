package com.bddeveris.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bddeveris.runner.ClassInit;

public class DropDown {
	
	WebDriver driver;
	
	//Values
	String _dpd_dropDown = "//select[@id='dropdown']";
	
	
	public DropDown(WebDriver driver){
		this.driver = driver;
	}
	
	public void openUrl(String url) {
		this.driver = ClassInit.driver;
		this.driver.get(url);
	}
	
	public void selectByText(String text) throws InterruptedException {
		Select element = new Select(this.driver.findElement(By.xpath(_dpd_dropDown)));
		Thread.sleep(1500);
		element.selectByVisibleText(text);
		Thread.sleep(1500);
	}
	
	public void selectByValue(String value) throws InterruptedException {
		Select element = new Select(this.driver.findElement(By.xpath(_dpd_dropDown)));
		Thread.sleep(1500);
		element.selectByValue(value);
		Thread.sleep(1500);
	}	
	
	public void selectByIndex(int index) throws InterruptedException {
		Select element = new Select(this.driver.findElement(By.xpath(_dpd_dropDown)));
		Thread.sleep(1500);
		element.selectByIndex(index);
		Thread.sleep(1500);
	}
	
	public String valueSelected() throws InterruptedException {
		Select element = new Select(this.driver.findElement(By.xpath(_dpd_dropDown)));
		WebElement option = element.getFirstSelectedOption();
		String text = option.getText();
		return text;
	}
	
}
