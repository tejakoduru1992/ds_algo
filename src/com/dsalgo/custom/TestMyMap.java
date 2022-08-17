package com.dsalgo.custom;

import java.util.*;

public class TestMyMap {
	
	public static void main(String args[]) {
		MyMap mp=new MyMap();
		mp.put("a", new ArrayList<String>());
		mp.get("a").add("c");
		
		for(Map.Entry<String, List<String>> entry: mp.entrySet()){
			System.out.println("Before add method " + entry.getKey() +" --> "+ entry.getValue());
		}
		
		mp.add("a", "b"); // existing entry added with put
		mp.add("x", "y"); // new entry
		mp.add("a", "d"); // addition to existing one
		mp.add("x", "z"); // addition to the new entry
		
		for(Map.Entry<String, List<String>> entry: mp.entrySet()){
			System.out.println("After add method " + entry.getKey() +" --> "+ entry.getValue());
		}
		
	}

}
