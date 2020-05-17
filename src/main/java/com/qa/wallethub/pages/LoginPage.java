package com.qa.wallethub.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}

	// Define page locators 
	
	By Username=By.cssSelector("input#email.inputtext.login_form_input_box");
	By Password=By.cssSelector("input#pass.inputtext.login_form_input_box");
	By Login=By.cssSelector("#u_0_b");
	
	// Create page actions
	
	public String getpagetitle() {
		
		return driver.getTitle();
	}
	
	public void login(String Un, String Pwd) {
		sendkeys(Username, Un);
		sendkeys(Password, Pwd);
		click(Login);
		
		
	
	}
	
}
