package com.sample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerClass.class)
public class SampleListeners {

	@Test
	private void tc1() {

		System.out.println("tc1");
	}

	@Test
	private void tc2() {
		Assert.assertTrue(false);
		System.out.println("tc2");
	}

	@Test(dependsOnMethods = "tc2")
	private void tc3() {
		System.out.println("tc3");
	}

	@Test(timeOut = 1000)
	private void tc4() throws InterruptedException {
		Thread.sleep(2000);

		System.out.println("tc4");
	}
}
