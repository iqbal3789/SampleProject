package com.testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	@Test
	private void tc1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(3000);
		a1.accept();

		/*
		 * driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click(); Alert a2
		 * = driver.switchTo().alert(); Thread.sleep(5000); a2.accept();
		 */

		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Alert a3 = driver.switchTo().alert();

		a3.dismiss();

		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		Alert a4 = driver.switchTo().alert();
		
		a4.sendKeys("Iqbal");
		

		String text = a4.getText();
		System.out.println(text);
		a4.accept();

	}

}
