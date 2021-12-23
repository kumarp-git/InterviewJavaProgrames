package com.kumar;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringDublicateChar {
	public static void main(String[] args) {
		String source = "beautiful beach";
		System.out.println("Source String: " + source);
		// findDublicateStringUsingTwoLoops(source);
		// findDublicateStringUsingMapAndLoop(source);
		findDublicateStringUsingMapAndLoopWithCount(source);
	}

	private static void findDublicateStringUsingTwoLoops(String source) {
		for (int i = 0; i < source.length(); i++) {
			for (int j = i + 1; j < source.length(); j++) {
				if (source.charAt(i) == source.charAt(j)) {
					System.out.print(" " + source.charAt(j));
					break;
				}
			}
		}
	}

	private static void findDublicateStringUsingMapAndLoop(String source) {
		char[] charArray = source.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for (char c : charArray) {
			if (c == ' ') {
				continue;
			}
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> countSet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : countSet) {
			if (entry.getValue() > 1) {
				System.out.print(" " + entry.getKey());
			}
		}
	}

	private static void findDublicateStringUsingMapAndLoopWithCount(String source) {
		char[] charArray = source.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for (char c : charArray) {
			if (c == ' ') {
				continue;
			}
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> countSet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : countSet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " found " + entry.getValue() + " times");
			}
		}
	}
}
