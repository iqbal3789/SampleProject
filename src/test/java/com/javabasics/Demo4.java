package com.javabasics;

public class Demo4 {

	public static void main(String[] args) {

		// and or not operator

		int a = 5;
		int b = 10;

		if (a > 4 && b > 9) {

			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		if (a > 10 || b > 9) {

			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}
}
