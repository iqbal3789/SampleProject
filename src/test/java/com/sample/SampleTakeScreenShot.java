package com.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.Base;

public class SampleTakeScreenShot extends Base {

	@Test
	private void tc1() throws IOException {

		browserLaunch("https://www.facebook.com/");
		maximize();
		printTitle();
		printUrl();

		WebElement user = driver.findElement(By.id("email"));
		sendValue(user, "123456");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("D:\\Selenium Practice\\Screenshot\\FBPage.jpeg");

		FileUtils.copyFile(source, destination);

	}

}
