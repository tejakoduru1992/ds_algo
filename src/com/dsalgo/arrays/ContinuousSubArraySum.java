package com.dsalgo.arrays;

/*
 * Given an unsorted array A of size N that contains only non-negative integers, 
 * find a continuous sub-array which adds to a given number S.
 * Input:
 * N = 5, S = 12
 * A[] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements 
 * from 2nd position to 4th position 
 * is 12.
 * 
 */

public class ContinuousSubArraySum {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 7, 5 };
		int s = 10;
		printContinuousSubArraySum(A, s);
	}

	public static void printContinuousSubArraySum(int[] A, int s) {

		int n = 0;
		int m = n + 1;
		int sum = A[n];
		while (n < A.length - 1) {
			if (sum == s) {
				System.out.println(n + 1);
				break;
			} else if (sum + A[m] == s) {
				// Sum found, returning positions from index
				System.out.println((n + 1) + " " + (m + 1));
				break;
			} else if (sum + A[m] < s) {
				sum = sum + A[m];
				m++;
			} else if (sum + A[m] > s) {
				n++;
				m = n + 1;
				sum = A[n];
			}

		}

	}
}
