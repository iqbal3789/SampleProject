package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

	/*
	 * @BeforeClass private void beforeClass() { System.out.println("@BeforeClass");
	 * }
	 * 
	 * @BeforeMethod private void beforeMethod() {
	 * System.out.println("@BeforeMethod"); }
	 * 
	 * @Test private void tc1() { System.out.println("Tc1"); }
	 * 
	 * @Test private void tc2() { System.out.println("Tc2"); }
	 * 
	 * @Test private void tc3() { System.out.println("Tc3"); }
	 * 
	 * @AfterMethod private void afterMethod() { System.out.println("@AfterMethod");
	 * }
	 * 
	 * @AfterClass private void afterClass() { System.out.println("@AfterClass"); }
	 */

	@Test(invocationCount = 5)
	private void tc4() {

		System.out.println("Tc4");
	}

}
