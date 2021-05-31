package com.dsalgo.arrays;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target,  * 
 * return indices of the two numbers such that they add up to target. *
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
*/

/* Store Index and Element in a Map
 * While Iterating, check for complement
 * return indices array if complement is found
 * */

public class SumOfNumIndexUnsorted {	
	public int[] twoSum(int[] nums, int target) {
	       Map<Integer,Integer> resultMap= new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	           int complementNum= target- nums[i];
	            if(resultMap.containsKey(complementNum)){
	                return new int[]{resultMap.get(complementNum),i};
	            }
	            resultMap.put(nums[i],i);
	        }        
	        return new int[]{};
	    }

}
