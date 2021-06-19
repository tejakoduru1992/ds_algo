package com.dsalgo.string;

import java.util.ArrayList;
import java.util.List;

public class StringManipulations {
	
	static List<String> subsetList=new ArrayList<String>();
	static List<String> permutationsList=new ArrayList<String>();

	public static void main(String[] args) {
		StringManipulations sm= new StringManipulations();
		sm.stringSubSets("ABC","",0);
		// List of Subsets
		System.out.println(subsetList);
		// Longest common subsequence
		System.out.println(sm.lcs("AGGTAB", "GXTXAYB",6,7));
		// Permutations List
		sm.getPermutations("ABCD", "");
		System.out.println(permutationsList);
		
	}
	
	public void stringSubSets(String s, String c, int i) {
		if(s.length()==i) {
			subsetList.add(c);
			return;
		}
		else {
			stringSubSets(s,c,i+1);
			stringSubSets(s,c+s.charAt(i),i+1);

		}
		
	}
	
	public int lcs(String s1, String s2, int m, int n) {
		if(m==0  || n==0 ) {
			return 0;
		}
		else if(s1.charAt(m-1)==s2.charAt(n-1)) {
			return 1+lcs(s1, s2, m-1,n-1);
		}
		else {
			return Math.max( lcs(s1,s2,m-1,n),lcs(s1,s2,m,n-1));
		}
		
	}
	
	public void getPermutations(String s,String ans) {
		if(s.length()==0) {
			permutationsList.add(ans);
			return;
		}
		else {
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				String ros=s.substring(0,i)+s.substring(i+1);
				getPermutations(ros,ans+ch);
			}
		}
		
		
	}

}
