package com.bddeveris.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bddeveris.runner.ClassInit;

public class AddRemoveElements {
	
	WebDriver driver;
	
	public AddRemoveElements(WebDriver driver){
		this.driver = driver;
	}
	
	public void openUrl(String url) {
		this.driver = ClassInit.driver;
		this.driver.get(url);
	}
	
	public WebElement deleteButton() {
		WebElement element = this.driver.findElement(By.xpath("//button[text()='Delete'][last()]"));
		return element;
	}
	
	public WebElement addElementButton() {
		WebElement element = this.driver.findElement(By.xpath("//button[text()='Add Element']"));
		return element;
	}
	
	public List<WebElement> deleteButtons(){
		List<WebElement> elements = this.driver.findElements(By.xpath("//button[text()='Delete']"));
		return elements;
	}
}
