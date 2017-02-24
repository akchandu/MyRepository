package com.study.bitwise;

public class FindOddNumber {

	public static void main(String[] args) {

		int[] d = {0, 0, 1, 2, 1, 2, 3};
		int o = d[0];
		for (int i = 1; i < d.length; i++) {
			o = o ^ d[i];
		}
		System.out.println(o);
	}
	
}
