package com.testNG;

import org.testng.annotations.Test;

public class Demo {

	@Test(priority = 4)
	private void tc1() {

		System.out.println("Tc1");
	}

	@Test(priority = 3)
	private void tc2() {

		System.out.println("Tc2");
	}

	//skip
	@Test(enabled=false)
	private void tc3() {

		System.out.println("Tc3");
	}

	@Test(priority = 2)
	private void tc4() {

		System.out.println("Tc4");
	}

	@Test(priority = 1)
	private void tc5() {

		System.out.println("Tc5");
	}
}
