package com.iteration;

public class ForLoop {
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		System.out.println(factorial(3));
		printAsteriskTriangle(4);
	}

	public static Integer factorial(Integer number) {
		Integer factorialValue = 1;
		for (int i = 1; i < number + 1; i++) {
			factorialValue *= i;
		}

		return factorialValue;
	}

	// *
	// **
	// ***
	// ****
	// *****
	// ******

	public static void printBasicAstrisk(Integer number) {
		for (int i = 1; i < number + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void printReverseBasicAstrisk(Integer number) {
		for (int i = number; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void printAsteriskTriangle(Integer number) {
		Integer count = 0;
		for (int i = number; i >= 1; i--) {
			for (int k = 0; k < count; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("*");
			}

			for (int k = 0; k < count; k++) {
				System.out.print(" ");
			}
			System.out.println("");
			count += 1;
		}
	}

}
