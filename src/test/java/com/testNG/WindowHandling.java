package com.testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();

		// Parent Window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.id("newWindowBtn")).click();

		// All Windows
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		for (String x : allWindows) {

			if (!x.equals(parentWindow)) {

				driver.switchTo().window(x);

				driver.findElement(By.id("firstName")).sendKeys("Besant");

				Thread.sleep(4000);

				driver.close();
			}

		}

		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("Technologies");

		Thread.sleep(3000);
		
		driver.quit();

	}

}
