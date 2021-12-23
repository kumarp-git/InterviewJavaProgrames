package com.kumar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ShortestUniqueSubString {
	public static void main(String[] args) {
		String s = "abaaba";//2
		//String s = "zyzyzyz";//5
		//String s= 
		 System.out.println(smallestSubstring(s));
		//System.out.println(smallestSubStringCount(s));
	}

	public static int smallestSubStringCount(String S) {
		// Stores all occurences
		ArrayList<String> a1 = new ArrayList<>();
		// Generate all the substrings

		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
					// Append all substrings
					a1.add(S.substring(i, j));
			}
		}

		// Take into account
		// all the substrings
		TreeMap<String, Integer> a2 = new TreeMap<>();
		for (String s : a1)
			a2.put(s, a2.getOrDefault(s, 0) + 1);

		ArrayList<String> freshlist = new ArrayList<>();

		// Iterate over all
		// unique substrings
		for (String s : a2.keySet()) {

			// If frequency is 1
			if (a2.get(s) == 1)

				// Append into fresh list
				freshlist.add(s);
		}

		// Initialize a dictionary
		TreeMap<String, Integer> dictionary = new TreeMap<>();

		for (String s : freshlist) {

			// Append the keys
			dictionary.put(s, s.length());
		}

		ArrayList<Integer> newlist = new ArrayList<>();

		// Traverse the dictionary
		for (String s : a2.keySet())
			newlist.add(a2.get(s));

		int ans = Integer.MAX_VALUE;

		for (int i : newlist)
			ans = Math.min(ans, i);

		// Return the minimum of dictionary
		return ans == Integer.MAX_VALUE ? 0 : ans;
		
	}

	// Function to find the smallest
	// substring occurring only once
	static int smallestSubstring(String S) {
		// Stores all occurences
		ArrayList<String> a1 = new ArrayList<>();
		// Generate all the substrings

		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j <= S.length(); j++) {
				// Avoid multiple occurences
				//if (i != j)
					// Append all substrings
					a1.add(S.substring(i, j));
			}
		}

		// Take into account
		// all the substrings
		TreeMap<String, Integer> a2 = new TreeMap<>();
		for (String s : a1)
			a2.put(s, a2.getOrDefault(s, 0) + 1);

		ArrayList<String> freshlist = new ArrayList<>();

		// Iterate over all
		// unique substrings
		for (String s : a2.keySet()) {

			// If frequency is 1
			if (a2.get(s) == 1)

				// Append into fresh list
				freshlist.add(s);
		}

		// Initialize a dictionary
		TreeMap<String, Integer> dictionary = new TreeMap<>();

		for (String s : freshlist) {

			// Append the keys
			dictionary.put(s, s.length());
		}

		ArrayList<Integer> newlist = new ArrayList<>();

		// Traverse the dictionary
		for (String s : dictionary.keySet())
			newlist.add(dictionary.get(s));

		int ans = Integer.MAX_VALUE;

		for (int i : newlist)
			ans = Math.min(ans, i);

		// Return the minimum of dictionary
		return ans == Integer.MAX_VALUE ? 0 : ans;
	}
}
