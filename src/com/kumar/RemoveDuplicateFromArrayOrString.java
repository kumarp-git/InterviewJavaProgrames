package com.kumar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayOrString {
	public static void main(String[] args) {
		String[] source = { "2", "3", "5", "7", "7", "11" };
		System.out.println("Source array");
		for (int i = 0; i < source.length; i++) {
			System.out.print(" " + source[i]);
		}
		System.out.println("\nAfter removing duplicate value from array");
		// removeDuplicateFromArrayUsingSet(source);
		removeDuplicateFromArrayUsingList(source);
	}

	private static void removeDuplicateFromArrayUsingSet(String[] source) {
		Set<String> strSet = new HashSet<>();
		for (int i = 0; i < source.length; i++) {
			strSet.add(source[i]);
		}
		System.out.println(strSet);
	}

	private static void removeDuplicateFromArrayUsingList(String[] source) {
		List<String> strList = new ArrayList<>();
		for (int i = 0; i < source.length; i++) {
			strList.add(source[i]);
		}
		strList = strList.stream().distinct().collect(Collectors.toList());
		System.out.println(strList);
	}
	
	private static void removeDuplicateFromArrayUsingListWithRemove(String[] source) {
		List<String> strList = new ArrayList<>();
		for (int i = 0; i < source.length; i++) {
			strList.add(source[i]);
		}
		strList = strList.stream().distinct().collect(Collectors.toList());
		System.out.println(strList);
	}

}
