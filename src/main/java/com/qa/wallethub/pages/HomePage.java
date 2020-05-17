package com.qa.wallethub.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	// Define page locators 
	
		By whats_on_your_mind=By.cssSelector("div.pipptul6.a5q79mjw");
		By whats_on_your_mind_TextArea=By.cssSelector("div.ll8tlv6m.o6r2urh6.j83agx80.buofh1pr.datstx6m.l9j0dhe7.oh7imozk");
		
		By Post_Button=By.cssSelector("#mount_0_0 > div > div > div:nth-child(3) > div > div > div.rq0escxv.l9j0dhe7.du4w35lb > div > div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div > div > form > div > div.kr520xx4.pedkr2u6.pmk7jnqg.j9ispegn.ms05siws.pnx7fd3z.b7h9ocf4 > div > div.j83agx80.cbu4d94t.f0kvp8a6.mfofr4af.l9j0dhe7.oh7imozk > div.ihqw7lf3.discj3wi.l9j0dhe7 > div.k4urcfbm.dati1w0a.hv4rvrfc.i1fnvgqd.j83agx80.rq0escxv.bp9cbjyn.discj3wi > div");
		//By Message_ouput=By.cssSelector("div.kvgmc6g5.cxmmr5t8.oygrvhab.hcukyx3x.c1et5uql>div");
		
		
		// post method
		public void Post(String txt)  {
			click(whats_on_your_mind); 
			wait.until(ExpectedConditions.visibilityOfElementLocated(whats_on_your_mind_TextArea));
			sendkeys(whats_on_your_mind_TextArea,txt);
			click(Post_Button);
			
		}
	

}

