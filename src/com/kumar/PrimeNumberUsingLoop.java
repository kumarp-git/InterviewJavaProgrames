package com.kumar;

public class PrimeNumberUsingLoop {
	public static void main(String[] args) {
		//findPrimeUsingForLoop(29);
		findPrimeUsingWhileLoop(29);
	}

	public static void findPrimeUsingForLoop(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + " is a prime");
		} else {
			System.out.println(num + " is not a prime");
		}
	}

	public static void findPrimeUsingWhileLoop(int num) {
		boolean flag = false;
		int i = 2;
		while (i <= num / 2) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
			i++;
		}
		if (!flag) {
			System.out.println(num + " is a prime");
		} else {
			System.out.println(num + " is not a prime");
		}
	}
}
