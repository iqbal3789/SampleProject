package com.testNG;

import org.testng.annotations.Test;

import com.base.Base;

public class SampleCmd extends Base {

	@Test
	private void tc1() {

		browserLaunch("https://www.amazon.in/");
		maximize();
		printTitle();
		printUrl();
	}
}
