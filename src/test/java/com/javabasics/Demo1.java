package com.javabasics;

public class Demo1 {

	public static void main(String[] args) {

		// break
		for (int i = 0; i <= 5; i++) {
			if (i == 5) {

				break;

			}
			System.out.println(i);
		}

		// continue -skip

		for (int i = 0; i <= 15; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
