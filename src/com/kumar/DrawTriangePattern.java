package com.kumar;

public class DrawTriangePattern {
	public static void main(String[] args) {
		// drawTrianglePattern();
		// drawTrianglePatternNumber();
		// drawTrianglePatternNumbers();
		drawReverseTrianglePatternNumbers();
	}

	private static void drawTrianglePattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void drawTrianglePatternNumber() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void drawTrianglePatternNumbers() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

	private static void drawReverseTrianglePatternNumbers() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j>=i; j--) {
				System.out.print(" "+i);
			}

			System.out.println();
		}
	}
}
