package com.kumar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversingSentence {
	public static void main(String[] args) {
		String reverseWords = reverseWords("I am Kumar");
		System.out.println(reverseWords);
	}

	public static String reverseWords(String sentence) {
		List<String> words = Arrays.asList(sentence.split("\\s"));
		Collections.reverse(words);
		StringBuilder sb = new StringBuilder(sentence.length());
		for (int i = words.size() - 1; i >= 0; i--) {
			sb.append(words.get(i));
			sb.append(' ');
		}
		return sb.toString().trim();
	}

	public static String reverseString(String line) {
		if (line.trim().isEmpty()) {
		}
		return line;
	}

}
