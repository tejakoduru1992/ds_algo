package com.dsalgo.string;

import java.util.ArrayList;

public class StringSubSets {
	public static ArrayList<String> myList = new ArrayList<String>();

	public static void main(String[] args) {
		stringSubSet("AB","",0);
		System.out.println(myList);
	}

	public static void stringSubSet(String s, String c, int i) {
		if (s.length() == i) {
			myList.add(c);
			return;
		} else {
			stringSubSet(s, c, i + 1);
			stringSubSet(s, c + s.charAt(i), i + 1);
		}
	}
}
