package com.kumar;

public class GCDUsingLoopAndIfElseStatement {
	public static void main(String[] args) {
		int n1 = 81;
		int n2 = 153;
		while (n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			} else {
				n2 -= n1;
			}
		}
		System.out.println("GCD is: " + n1);
	}
}
