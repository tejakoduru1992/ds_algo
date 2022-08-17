package com.dsalgo.custom;

import java.util.*;

public class MyMap extends HashMap<String,List<String>> implements Map<String,List<String>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void add(String s1, String s2) {
		List<String> list= get(s1);
		if(list==null) {
			list= new ArrayList<String>();
		}
		list.add(s2);
		put(s1,list);
	}
	

}
