package com.kumar;

public class FactorialUsingLoop {
	public static void main(String[] args) {
		int fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (int i = 1; i <=number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is:" + fact);
	}
}
