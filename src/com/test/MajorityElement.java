package com.test;

import java.util.Arrays;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
// 
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
// 
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 104
//-109 <= nums[i] <= 109

public class MajorityElement {
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		return nums[n / 2];
	}

	public static void main(String[] args) {
		MajorityElement sol = new MajorityElement();
		sol.testOutput(new int[] { 3, 2, 3 }, 3);
		sol.testOutput(new int[] { 2, 2, 1, 1, 1, 2, 2 }, 2);
	}

	private void testOutput(int[] in, int exp) {
		MajorityElement sol = new MajorityElement();
		if (sol.majorityElement(in) == exp) {
			System.out.println("PASS");
		} else {
			System.out.println("Expected/Got:" + exp + " / " + sol.majorityElement(in));
		}
	}
}
