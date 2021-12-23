package com.kumar;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 371;
		// int num = 1634;
		// armstrongNumber(num);
		armstrongNumberWithoutUsinMathPow(num);
	}

	private static void armstrongNumber(int number) {
		int originalNumber;
		int remainder;
		int result = 0;
		originalNumber = number;
		int length = String.valueOf(number).length();
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, length);
			originalNumber /= 10;
		}
		if (result == number) {
			System.out.println(number + " is an Amrstrong number ");
		} else {
			System.out.println(number + " is not an Amrstrong number ");
		}
	}

	private static void armstrongNumberWithoutUsinMathPow(int number) {
		int originalNumber;
		int remainder;
		int result = 0;
		originalNumber = number;
		int length = String.valueOf(number).length();
		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			int power=1;
			for (int i = 0; i < length; i++) {
				power = (power * remainder);
			}
			result += power;
			originalNumber /= 10;
		}
		if (result == number) {
			System.out.println(number + " is an Amrstrong number ");
		} else {
			System.out.println(number + " is not an Amrstrong number ");
		}
	}

}
