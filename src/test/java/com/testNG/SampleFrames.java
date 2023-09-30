package com.testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		List<WebElement> totalCount = driver.findElements(By.tagName("iframe"));
		int size = totalCount.size();
		System.out.println(size);

		// Switch to Frame
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("2354365");

		Thread.sleep(5000);

		// Switch to Parent Frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).sendKeys("Testing");

		Thread.sleep(3000);

		// switch into frames
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("Google");

		Thread.sleep(3000);

		driver.switchTo().frame("frm1");
		WebElement courseName = driver.findElement(By.id("course"));
		Select s = new Select(courseName);
		s.selectByValue("java");
		
		Thread.sleep(3000);

		// Switch Back to Parent Frame
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("  Completed");
	}

}
