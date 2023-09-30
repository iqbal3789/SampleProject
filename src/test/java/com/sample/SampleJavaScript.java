package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.Base;

public class SampleJavaScript extends Base {

	@Test
	private void tc1() throws InterruptedException {

		// browserLaunch("https://www.facebook.com/");
		browserLaunch("https://www.amazon.in/");
		maximize();
		printTitle();
		printUrl();

		WebElement down = driver.findElement(By.xpath("//*[contains(text(), 'Connect with Us')]"));
		WebElement up = driver.findElement(By.xpath("//*[text()='Amazon miniTV']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(1000);
		js.executeScript("arguments{0].scrollIntoView(true)", up);

		/*
		 * WebElement user = driver.findElement(By.id("email")); WebElement pass =
		 * driver.findElement(By.id("pass")); WebElement loginButton =
		 * driver.findElement(By.name("login"));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].setAttribute('value','Hello Java')", user);
		 * Object o = js.executeScript("return arguments[0].getAttribute('value')",
		 * user); System.out.println(o);
		 * 
		 * js.executeScript("arguments[0].setAttribute('value','123456')", pass);
		 * js.executeScript("arguments[0].click()", loginButton);
		 */

	}

}
