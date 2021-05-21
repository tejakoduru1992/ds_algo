package com.dsalgo.math;

public class CountOfDigits {

	public static void main(String args[]) {
		System.out.println(getCountIterative(123));
		System.out.println(getCountRecursive(123));

	}

	public static int getCountIterative(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			++count;
		}
		return count;
	}

	public static int getCountRecursive(int num) {
		// Base condition
		if (num == 0)
			return 0;
		return 1 + getCountRecursive(num / 10);
	}

}