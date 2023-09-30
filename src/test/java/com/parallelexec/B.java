package com.parallelexec;

import org.testng.annotations.Test;

public class B {

	/*@Test(threadPoolSize = 4, invocationCount = 4)
	private void tc3() {

		System.out.println("tc3");
		System.out.println(Thread.currentThread().getId());
	}*/
	
	

	@Test
	private void tc4() {

		System.out.println("tc4");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc5() {
		
		System.out.println("tc5");
		System.out.println(Thread.currentThread().getId());
	}

}
