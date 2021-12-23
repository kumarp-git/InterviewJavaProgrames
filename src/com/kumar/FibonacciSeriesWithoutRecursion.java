package com.kumar;

public class FibonacciSeriesWithoutRecursion {

	public static void main(String[] args) {
		//fibonacciSeriesUsingForLoop(10);
		fibonacciSeriesUsingWhileloop(10);
	}

	public static void fibonacciSeriesUsingForLoop(int n) {
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void fibonacciSeriesUsingWhileloop(int n) {
		int num1 = 0;
		int num2 = 1;
		int counter = 0;
		while (counter < n) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter= counter + 1;
		}
	}
}
