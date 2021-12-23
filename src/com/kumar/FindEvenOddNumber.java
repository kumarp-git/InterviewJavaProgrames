package com.kumar;

import java.util.ArrayList;
import java.util.List;

public class FindEvenOddNumber {
	public static void main(String[] args) {
		//findOddEvenNumber(10);
		findEvenOddNumberFromGivenRange(10);
	}

	private static void findOddEvenNumber(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is Even");
		} else {
			System.out.println(num + " is odd");
		}
	}
	private static void findEvenOddNumberFromGivenRange(int rangeNumber) {
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		for (int i = 0; i <= rangeNumber; i++) {
			if (i % 2 == 0) {
				evenList.add(i);
			} else {
				oddList.add(i);
			}
		}
		System.out.println("Even Numbers");
		evenList.forEach(n->System.out.print(" "+n));
		System.out.println("\nOdd Numbers");
		oddList.forEach(n->System.out.print(" "+n));
	}
}
