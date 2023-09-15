package com.test;

import java.util.Arrays;

public class FirstMissing {
	public int firstMissingPositive(int[] nums) {
		 int smallest = 1;

	        Arrays.sort(nums);
	        for (int i = 0; i < nums.length; i++) {

	            if (nums[i] == smallest) {

	                smallest++;
	            }
	        }

	        return smallest;
	}

//	public static void main(String[] args) {
//		int[] nums = { 0, 0, -1, 0 };
//		int result = firstMissingPositive(nums);
//		System.out.println("First Missing Positive: " + result);
//	}
	
	public static void main(String[] args) {
		FirstMissing sol = new FirstMissing();
       sol.testOutput(new int[]{-9, 1, 2},3);
       sol.testOutput(new int[]{-9, 2},1);
       sol.testOutput(new int[]{92,93,0,-100},1);
       sol.testOutput(new int[]{-1000000},1);
       sol.testOutput(new int[]{-5,6,-3,7,3,10,1000,-4000},1);
       sol.testOutput(new int[]{999999,-1000000,999998,-999999,-999998,1000000},1);
       sol.testOutput(new int[]{4,6,1,0,-9,10,0,-4},2);
       sol.testOutput(new int[]{-1},1);
       sol.testOutput(new int[]{1},2);
       sol.testOutput(new int[]{1000},1);
       sol.testOutput(new int[]{9,10, 12,1000000},1);
       sol.testOutput(new int[]{1, 3, 6, 4, 1, 2},5);
       sol.testOutput(new int[]{0, 2, 3},1);
       sol.testOutput(new int[]{-1,-3,-10,-100},1);
       sol.testOutput(new int[]{100, 98, 93,78,84, 34,0,1,2,102,130,123,150,200,199,185,149},3);
       sol.testOutput(new int[]{10,9,8,8,7,6,5,4,3,2,1,0,20,19,18,17,16,15,14,13,12},11);
   }

   private void testOutput(int[] in, int exp){
	   FirstMissing sol = new FirstMissing();
       if(sol.firstMissingPositive(in) == exp){
           System.out.println("PASS");
       }else{
           System.out.println("Expected/Got:"+exp+" / " + sol.firstMissingPositive(in));
       }
   }
}
