package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;

	public static void browserLaunch(String Url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Url);
	}

	public static String stringData(int row, int cell) throws IOException {

		File location = new File("D:\\Selenium Practice\\SeleniumTestNG\\src\\test\\resources\\TestData.xlsx");
		FileInputStream input = new FileInputStream(location);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Python");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String s1 = c.getStringCellValue();
		return s1;

	}

	public static String numericData(int row, int cell) throws IOException {

		File location = new File("D:\\Selenium Practice\\SeleniumTestNG\\src\\test\\resources\\TestData.xlsx");
		FileInputStream input = new FileInputStream(location);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet("Python");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double d = c.getNumericCellValue();
		long l = (long) d;
		String s1 = String.valueOf(l);
		return s1;

	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void quitBrowser() {

		driver.quit();
	}

	public static void closeTab() {

		driver.close();
	}

	public static void printUrl() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void printTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void sendValue(WebElement ref, String value) {

		ref.sendKeys(value);

	}

}
