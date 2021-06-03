package com.dsalgo.arrays;

public class BinarySearch {

	private int[] arr;

	int searchElement(int element, int startIndex, int endIndex) {
		// binary search

		int pivot = (startIndex+endIndex) / 2;

		if (element == arr[pivot])
			return pivot;
		else if(startIndex>=endIndex)
			return -1;
		else if (element < arr[pivot]) { 
			return searchElement(element, 0, pivot);
		} else if (element > arr[pivot]) {
			return searchElement(element, pivot+1, arr.length - 1);

		} else {
			System.out.println("Element not found");

			pivot = -1;
		}

		return pivot;
	}
	
	public void setArr(int[] arr) {
		this.arr=arr;
	}
	
	public static void main(String args[]) {
		
		int[] myArr = { 1, 2, 3, 4, 5, 6 };
		BinarySearch sortedArr= new BinarySearch();
		sortedArr.setArr(myArr);
		System.out.println("Element is at Index- "+sortedArr.searchElement(6, 0, myArr.length-1));

		
	}
}
