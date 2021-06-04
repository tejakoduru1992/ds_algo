package com.dsalgo.arrays;

import java.util.ArrayList;
import java.util.List;

/* 	Given an array A of positive integers. 
 *  Your task is to find the leaders in the array. 
 *  An element of array is leader if it is greater than or equal to all the elements to its right side. 
 *  The rightmost element is always a leader. 
 *	Input:
 *	n = 6
 *	A[] = {16,17,4,3,5,2}
 *	Output: 17 5 2
 *	Explanation: The first leader is 17 
 *	as it is greater than all the elements
 *	to its right.  Similarly, the next 
 *	leader is 5. The right most element 
 *	is always a leader so it is also 
 *	included. */

public class FindLeaders {

	public static void main(String[] args) {
		int[] A = { 16, 17, 4, 3, 5, 2, 7 };
		int n = A.length;
		System.out.println(getLeaderList(A, n));

	}

	public static List<Integer> getLeaderList(int[] A, int n) {
		List<Integer> result = new ArrayList<Integer>();
		int l = 0;
		int m = n - 1;
		while (l <= m) {
			if (l == m) {
				result.add(A[l]);
				l++;
				m= n-1;
			} else if (A[l] > A[m]) {
				m--;
			} else if (A[l] < A[m]) {
				l++;
				m = n - 1;
			}
		}
		return result;
	}

}
