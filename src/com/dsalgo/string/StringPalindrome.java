package com.dsalgo.string;

public class StringPalindrome {
	
	public static void main(String[] args) {
		System.out.println(isStringPalindrome("abcbac",0,6));
	}
	
	
	public static boolean isStringPalindrome(String s,int start,int end) {
		if(start>=end)
			return true;
		else {
			if(s.charAt(start)==s.charAt(end-1)) {
				start++;
				end--;
				return isStringPalindrome(s,start,end);
			}
			else {
				return false;
			}
			
		}
	}

}


