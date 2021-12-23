package com.kumar;

public class SquareRootOfNumber {
	public static void main(String[] args) {
		int num = 64;
		// squareRootOfNumberUsingMathSqrtMethod(num);
		squareRootOfNumberWitghoutMathSqrtMethod(num);
	}

	private static void squareRootOfNumberUsingMathSqrtMethod(int num) {
		double squreRoot = StrictMath.sqrt(num);
		// double squreRoot = Math.sqrt(num);

		// default impl. delegates to StrictMath
		// Note that hardware sqrt instructions
		// frequently can be directly used by JITs
		// and should be much faster than doing
		// Math.sqrt in software.
		System.out.println("Square root of " + num + " is: " + squreRoot);
	}

	private static void squareRootOfNumberWitghoutMathSqrtMethod(int num) {
		double temp=0.0;
		double sqrt = num / 2;
		while ((temp - sqrt) != 0.0) {
			temp = sqrt;
			sqrt = (temp + (num / temp)) / 2;
		}
		System.out.println("Square root of " + num + " is: " + sqrt);
	}
}
