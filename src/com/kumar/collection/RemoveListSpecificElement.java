package com.kumar.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveListSpecificElement {
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(2);
		intList.add(4);
		intList.add(7);
		intList.add(3);
		intList.add(5);
		intList.add(6);
		intList.add(8);
		intList.add(10);
		intList.add(9);
		System.out.println("Original List: " + intList);

		// Java 7
		/*
		 * for (Integer intV : intList) { if (intV == (10)) { intList.remove(intV); } }
		 * System.out.println("Removed 10 value or element from the List: " + intList);
		 */
		// Java 8
		/*
		 * intList.removeIf(i->i==10);
		 * System.out.println("Removed 10 value or element from the List: " + intList);
		 */

		// Using iterator
		Iterator<Integer> itr = intList.iterator();
		while (itr.hasNext()) {
			Integer intV = itr.next();
			if (intV == 10) {
				intList.remove(intV);
			}
		}
		System.out.println("Removed 10 value or element from the List: " + intList);
	}

}
