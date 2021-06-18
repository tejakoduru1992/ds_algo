package com.dsalgo.string;

import java.util.ArrayList;

public class PermutationsOfString {
	public static ArrayList<String> permutationsList=new ArrayList<String>();

	public static void main(String[] args) {
		String s="SAI";
		
		permutationsOfString(s,"");
		System.out.println(permutationsList);

		System.out.println(permutationsList.size());
	}

	
	public static void permutationsOfString(String s, String ans) {
		
		if(s.length()==0) {
			permutationsList.add(ans);
			return;
		}
		
		for(int i=0;i< s.length();i++) {
			char ch=s.charAt(i);
			String ros = s.substring(0, i) + 
                    s.substring(i + 1);
			permutationsOfString(ros, ans + ch);
			
			
		}
		
		
	}

}
