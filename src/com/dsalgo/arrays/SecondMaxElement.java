package com.dsalgo.arrays;

public class SecondMaxElement {

	public static void main(String[] args) {

		int[] arr = {10, 7,1, 2, 3, 4, 5, 6, 7, 8,9 };
		SecondMaxElement secondEle = new SecondMaxElement();
		System.out.println(secondEle.getSecondMaxElement(arr));

	}

	public Integer getSecondMaxElement(int[] arr) {
		Integer first = Integer.MIN_VALUE;
		Integer second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}
		}

		return second;

	}
}
