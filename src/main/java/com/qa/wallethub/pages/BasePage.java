package com.qa.wallethub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage extends Page{

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	// create genetic methods
	
	public void click(By locator) {
		
		driver.findElement(locator).click();
	}
	
	public void sendkeys(By locator, String Text) {
		
		driver.findElement(locator).sendKeys(Text);
	}
	
public String gettext(By locator) {
		
		return driver.findElement(locator).getText();
	}

}
