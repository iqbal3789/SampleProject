package com.parallelexec;

import org.testng.annotations.Test;

public class ParallelExecByMethod {
	@Test
	private void tc1() {
		System.out.println("tc1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc2() {
		System.out.println("tc2");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc3() {
		System.out.println("tc3");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc4() {
		System.out.println("tc4");
		System.out.println(Thread.currentThread().getId());
	}

}
