package com.qa.wallethub.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.wallethub.pages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	
	@BeforeMethod
	public void setup() {
		//WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Girish\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
         driver = new ChromeDriver();
         wait= new WebDriverWait(driver,15);
         driver.manage().window().fullscreen();
 
        //Navigate to a URL
        driver.get("https://www.facebook.com/");
        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        page = new Page(driver,wait);
 
		
	}
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	

}
