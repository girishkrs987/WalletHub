package com.qa.wallethub.tests;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.wallethub.pages.HomePage;
import com.qa.wallethub.pages.LoginPage;

public class Assigenment_1 extends BaseTest{

	@Test(priority=1)
	public void verifyLoginpageTitle() {		
		String Title=page.getInstance(LoginPage.class).getpagetitle();		
		Assert.assertEquals("getting error", "Facebook – log in or sign up", Title);
	} 
	
	// Login to Facebook. Username and Password should be on 	a variable we can change
	
	@Test(priority=2)
	public void LoginTest() {
		page.getInstance(LoginPage.class).login("GGGG", "CKKKK");
		String Title=page.getInstance(LoginPage.class).getpagetitle();
		System.out.println(Title);
		
	} 
	
	// 2. Post a status message "Hello World"

	
	@Test(priority=3)
	public void Post_Helloworld()  {
		page.getInstance(LoginPage.class).login("GGGG", "CKKKK");
		page.getInstance(HomePage.class).Post("Hell woorld");
		
		} 
	
}
	