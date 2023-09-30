package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.Base;

public class SampleJavaScriptExe extends Base {

	@Test
	private void tc1() throws InterruptedException {

		browserLaunch("https://www.flipkart.com/");
		maximize();
		printUrl();
		printTitle();

		WebElement down = driver.findElement(By.xpath("//*[text()='HELP']"));
		WebElement up = driver.findElement(By.xpath("//*[text()='Mobiles']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", up);

	}

}
