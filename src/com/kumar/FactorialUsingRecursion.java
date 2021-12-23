package com.kumar;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int number = 4;
		int fact = factoria(number);
		System.out.println("Factorial of " + number+" is: "+fact);
	}

	public static int factoria(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factoria(n - 1));
		}

	}

}
