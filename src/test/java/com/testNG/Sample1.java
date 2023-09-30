package com.testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.Base;

public class Sample1 extends Base {

	@Test
	private void tc1() throws IOException {

		browserLaunch("https://www.facebook.com/");

		maximize();

		printUrl();

		printTitle();

		// quitBrowser();

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(stringData(0, 0));

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(numericData(0, 1));

	}
}
