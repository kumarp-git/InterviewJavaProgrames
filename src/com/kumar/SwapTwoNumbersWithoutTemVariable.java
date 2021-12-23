package com.kumar;

public class SwapTwoNumbersWithoutTemVariable {
	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		System.out.println("Before swaping x=" + x + " and y=" + y);
		// swapTwoNumbersUsingPlusMinus(x, y);
		// swapTwoNumbersUsingMultAndDiv(x, y);
		swapTwoNumbersUsingXOR(x, y);
	}

	private static void swapTwoNumbersUsingPlusMinus(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swaping x=" + x + " and y=" + y);
	}

	private static void swapTwoNumbersUsingMultAndDiv(int x, int y) {
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("After swaping x=" + x + " and y=" + y);
	}

	private static void swapTwoNumbersUsingXOR(int x, int y) {
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("After swaping x=" + x + " and y=" + y);
	}
}