package com.testNG;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.base.Base;

public class SampleExtentReport extends Base {
	ExtentReports report;
	ExtentSparkReporter spark;

	@BeforeClass
	private void beforeClass() {
		report = new ExtentReports();
		spark = new ExtentSparkReporter(
				"D:\\Selenium Practice\\SeleniumTestNG\\src\\test\\resources\\reports\\fb.html");
		report.attachReporter(spark);
		ExtentTest test = report.createTest("Execution started");
	}

	@Test
	private void tc1() {
		ExtentTest test = report.createTest("Browser Launch");
		browserLaunch("https://www.facebook.com/");
		test.info("Browser Launch Successfull");

	}

	@Test
	private void tc2() {
		ExtentTest test = report.createTest("Validate URL of the page");
		String url = driver.getCurrentUrl();
		if (url.equals("https://www.facebook.com/")) {
			test.pass("URL Successfully Validated");
		} else {
			test.fail("URL is not Validated");
		}
	}

	@AfterClass
	private void afterClass() {
		ExtentTest test = report.createTest("Quit Browser");
		test.info("Take Screenshot");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String source = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(source);
		report.flush();
		driver.quit();
	}
}
