package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.Base;
import com.page.FBLoginPage;

public class SamplePOM extends Base {

	@Test
	private void tc1() throws InterruptedException {

		browserLaunch("https://www.facebook.com/");

		maximize();
		printTitle();
		printUrl();

		// WebElement user = driver.findElement(By.id("email"));
		// sendValue(user, "Besant Technologies");

		FBLoginPage f = new FBLoginPage();
		f.getUser().sendKeys("Besant");
		f.getPass().sendKeys("12234");
		f.getLogin().click();

		//sendValue(f.getUser(), "Besant");
		Thread.sleep(5000);
		
		quitBrowser();

	}
}
