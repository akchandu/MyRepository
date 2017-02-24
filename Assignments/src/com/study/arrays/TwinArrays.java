package com.study.arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Problem statement - Twin arrays are those two unsorted arrays of equal length, 
 * where both arrays contains same elements (but not in same order).
 * Determine if given two arrays are twins or not.
 * @author kaddanki
 *
 */

public class TwinArrays {

	public static void main(String[] args) {

		TwinArrays obj = new TwinArrays();

		int[] array1 = {1,2,3,4,5,4,3,1,2};
		int[] array2 = {1,2,3,4,5,4,3,1,8};
		int[] arrayToSort = {14,23,9,12,4,33};
		boolean result = obj.checkForTwins(array1, array2);
		System.out.println("Given arrays are twins : " + result);

		obj.bubbleSort(arrayToSort);

	}

	private boolean checkForTwins(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 1;
		for (int i = 0; i < array1.length; i++) {
			count = 1;
			if (map.containsKey(array1[i])) {
				count = map.get(array1[i]);
				count = count + 1;
				map.put(array1[i], count);
			} else {
				map.put(array1[i], count);
			}
		}
		count = 0;
		for (int i = 0; i < array2.length; i++) {
			if (map.containsKey(array2[i])) {
				count = map.get(array2[i]);
				count = count - 1;
				map.put(array2[i], count);
			} else {
				return false;
			}
		}
		Collection<Integer> values = map.values();
		for (Iterator<Integer> it = values.iterator(); it.hasNext();) {
			Integer j = (Integer) it.next();
			if (j != 0) {
				return false;
			}
		}
		return true;
	}

	private void bubbleSort(int[] array1) {
		boolean swapped = true;
		for (int i = 0; i < array1.length; i++) {
			swapped = false;
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] < array1[j]) {
					int temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		System.out.println("Array after sorting");
		for (int k = 0; k < array1.length; k++) {
			System.out.print(array1[k] + " ");
		}

	}

}
