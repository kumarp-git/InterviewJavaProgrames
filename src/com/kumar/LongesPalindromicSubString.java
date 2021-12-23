package com.kumar;

public class LongesPalindromicSubString {
	public static void main(String[] args) {
		String findLogestPalidromeSubString = findLogestPalidromeSubString("bananas");
		System.out.println("Logest Palidrome Sub-String: " + findLogestPalidromeSubString);
	}

	public static String findLogestPalidromeSubString(String sourceStr) {

		// Validation Start
		if (sourceStr != null && sourceStr.isEmpty()) {
			return "Please Enter Valid String";
		}
		if (sourceStr.length() == 1) {
			return sourceStr;
		}
		// Validation End
		String longestLength = sourceStr.substring(0, 1);
		for (int i = 0; i < sourceStr.length(); i++) {
			String tmp = checkForEquality(sourceStr, i, i);
			if (tmp.length() > longestLength.length()) {
				longestLength = tmp;
			}
		}
		return longestLength;
	}

	public static String checkForEquality(String s, int begin, int end) {

		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}

}
