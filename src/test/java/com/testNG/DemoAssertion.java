package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAssertion {

	@Test
	private void tc1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);

		// Hard Assert
		// Assert.assertEquals(actualUrl, "https://www.facebook");

		// Soft Assert
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualUrl, "https://www.facebook");
		System.out.println("Validation passed");
		
		s.assertAll();

	}

	@Test
	private void tc2() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://portal.hdfc.com/login");
		
		System.out.println(driver.getCurrentUrl());

	}

}
