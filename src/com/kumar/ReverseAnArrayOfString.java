package com.kumar;

import java.util.Arrays;

public class ReverseAnArrayOfString {

	public static void main(String[] args) {
		String[] namesArray = { "Sachin", "Arun", "Kumar" };
		System.out.println("Original array: " + Arrays.toString(namesArray));
		reverse(namesArray);
	}

	private static void reverse(String[] namesArray) {
		if (null == namesArray || namesArray.length < 2) {
			return;
		}
		for (int i = 0; i < namesArray.length / 2; i++) {
			String temp = namesArray[i];
			namesArray[i] = namesArray[namesArray.length - 1 - i];
			namesArray[namesArray.length - 1 - i] = temp;
		}

		System.out.println("Reversed array: " + Arrays.toString(namesArray));
	}

}
