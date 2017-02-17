package com.study.bitwise;

public class MaximizingXor {

	public static void main(String[] args) {
		int l = 10, r = 15;
		System.out.println("Hello world");
		System.out.println(maximizeXor(l, r));

	}

	static int maximizeXor(int l, int r) {

		int maxXor = -1;
		int result;

		for (int i = l; i <= r; i++) {
			for (int j = l; j<= r; j++) {
				result = i ^ j;
				if (result > maxXor) {
					maxXor = result;
				}
			}
		} 
		return maxXor;
	}

}
