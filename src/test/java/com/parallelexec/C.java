package com.parallelexec;

import org.testng.annotations.Test;

public class C {

	@Test
	private void tc6() {

		System.out.println("tc6");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc7() {

		System.out.println("tc7");
		System.out.println(Thread.currentThread().getId());
	}

}
