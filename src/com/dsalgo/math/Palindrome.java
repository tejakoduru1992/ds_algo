package com.dsalgo.math;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(1234321));
		System.out.println(isPalindrome(105));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(567653));
	}

	public static boolean isPalindrome(int num) {
		int number = num;
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		if (reverse == number)
			return true;
		else
			return false;
	}
}
