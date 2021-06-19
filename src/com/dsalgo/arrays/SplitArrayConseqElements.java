package com.dsalgo.arrays;

import java.util.List;
import java.util.ArrayList;

public class SplitArrayConseqElements {

	public static void main(String[] args) {

		SplitArrayConseqElements sACE = new SplitArrayConseqElements();
		Integer[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 11,12,14 };
		System.out.println(sACE.splitArray(arr));
	}

	public List<ArrayList<Integer>> splitArray(Integer[] arr) {
		List<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> newList = new ArrayList<Integer>();
		int m = 0;
		while (m < arr.length) {
			if (m == arr.length - 1 || arr[m + 1] - arr[m] != 1) {
				newList.add(arr[m]);
				finalList.add(newList);
				newList = new ArrayList<Integer>();
			} else {
				newList.add(arr[m]);
			}
			m++;
		}
		return finalList;
	}

}
