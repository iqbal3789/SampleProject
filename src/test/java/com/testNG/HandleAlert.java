package com.testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	@Test
	private void tc1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();

		driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(3000);
		Alert a2 = driver.switchTo().alert();
		a2.dismiss();

		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		Alert a3 = driver.switchTo().alert();
		Thread.sleep(5000);
		a3.sendKeys("Iqbal");

		// Get Text
		String t1 = a3.getText();
		System.out.println(t1);
		a3.accept();
	}

	/*
	 * @Test private void tc2() throws InterruptedException {
	 * 
	 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
	 * ChromeDriver(); driver.get("https://demoqa.com/alerts");
	 * 
	 * driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * Alert a1 = driver.switchTo().alert(); a1.dismiss(); }
	 * 
	 * @Test private void tc3() throws InterruptedException {
	 * 
	 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * 
	 * driver.get("https://demoqa.com/alerts");
	 * driver.findElement(By.xpath("//*[@id='promtButton']")).click();
	 * 
	 * Alert a3 = driver.switchTo().alert(); a3.sendKeys("Iqbal");
	 * 
	 * // Get Text String t1 = a3.getText(); System.out.println(t1);
	 * 
	 * }
	 */

}
