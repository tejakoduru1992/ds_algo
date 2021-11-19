package com.dsalgo.arrays;

import java.util.ArrayList;
import java.util.List;

public class TestRecursion {

	public static void main(String[] args) {
		// Data Setup
		List<TestRecurssionItem> itNew = new ArrayList<TestRecurssionItem>();
		TestRecurssionItem it = new TestRecurssionItem();
		it.items = new ArrayList<String>();
		it.items.add("123");
		it.items.add("124");
		TestRecurssionItem it2 = new TestRecurssionItem();
		it2.items = new ArrayList<String>();
		it2.items.add("125");
		it2.items.add("126");
		TestRecurssionItem it3 = new TestRecurssionItem();
		it3.items = new ArrayList<String>();
		it3.items.add("127");
		it3.items.add("128");
		itNew.add(it);
		itNew.add(it2);
		itNew.add(it3);
		printRecurrsively(itNew, 0);
	}

	public static void printRecurrsively(List<TestRecurssionItem> ittList, int index) {
		TestRecurssionItem itt = ittList.get(index);
		if (itt == null && index >= ittList.size()) {
			return;
		} else {
			int i = 0;
			while (itt.items != null && i < itt.items.size()) {
				System.out.println(itt.items.get(i));
				i++;
			}
			if (index+1 < ittList.size()) {
				System.out.println("Fetching Next Node");
				printRecurrsively(ittList, ++index);
			}
		}

	}

}
