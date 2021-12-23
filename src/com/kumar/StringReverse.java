package com.kumar;

public class StringReverse {
	public static void main(String[] args) {
		String sourceStr = "Kumar";
		System.out.println("After reverse string: " + sourceStr);
		// stringWithoutUsingBuildInReverseMethod(sourceStr);
		stringUsingBuildInReverseMethod(sourceStr);
	}

	private static void stringWithoutUsingBuildInReverseMethod(String s) {
		String reverseStr = "";
		int len = s.length();
		for (int i = len - 1; i >= 0; i--) {
			reverseStr += s.charAt(i);
		}
		System.out.println("Before reverse string: " + reverseStr);
	}

	private static void stringUsingBuildInReverseMethod(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		StringBuilder reverseString = stringBuilder.reverse();
		System.out.println("Before reverse string: " + reverseString.toString());
	}
}
