package com.kumar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class BiggestValueXTIme {
	public static void main(String[] args) {
		// int[] A = { 3, 8, 2, 3, 3, 2 };
		// int[] A = { 7, 1, 2, 8, 2 };
		// int[] A = { 3, 1, 4, 1, 5 };
		int[] A = { 5, 5, 5, 5, 5 };

		int solution = BiggestValueXTIme.solution(A);
		if (solution > 1 && solution <= 100000) {
			System.out.println(solution);
		}
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		Map<Integer, Integer> r = new HashMap<>();
		for (int i : A) {
			if (r.containsKey(i)) {
				r.put(i, r.get(i) + 1);
			} else {
				r.put(i, 1);
			}
		}
		Set<Entry<Integer, Integer>> countSet = r.entrySet();
		int value = 0;
		for (Map.Entry<Integer, Integer> entry : countSet) {
			if (entry.getValue() > 1 && entry.getKey() > 1) {
				if (value < entry.getKey()) {
					value = entry.getKey();

				}
			}
		}
		return value;
	}
}
