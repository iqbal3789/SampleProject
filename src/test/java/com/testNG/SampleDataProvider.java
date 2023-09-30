package com.testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Base;

public class SampleDataProvider extends Base {

	@Test(dataProvider = "loginData")
	private void tc1(String user, String password) {

		browserLaunch("https://www.facebook.com/");
		Reporter.log("Browser launch");
		maximize();

		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		Reporter.log("Browser launch successfull");
	}

	@DataProvider(name = "loginData")
	public Object[][] login() {

		Object[][] data = new Object[2][2];

		data[0][0] = "Java";
		data[0][1] = "12345";
		data[1][0] = "API";
		data[1][1] = "67890";
		return data;
	}

}
