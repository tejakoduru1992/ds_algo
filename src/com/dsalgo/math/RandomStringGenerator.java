package com.dsalgo.math;

import java.util.Scanner;

public class RandomStringGenerator {

	public static void main(String[] args) {
		System.out.println("Please enter the value and press enter..");
		Scanner sc = new Scanner(System.in);
		String randomString = sc.next();
		int length = randomString.length();
		RandomStringGenerator rsg = new RandomStringGenerator();
		Boolean isNumeric = null != randomString ? randomString.matches("-?\\d+(\\.\\d+)?") : false;
		System.out.println("Random String is: " + rsg.generateRandomString(length, isNumeric));
	}

	public String generateRandomString(int length, boolean isNumeric) {
		String AlphaNumericString = isNumeric ? "0123456789"
				: "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		return sb.toString();
	}
}
