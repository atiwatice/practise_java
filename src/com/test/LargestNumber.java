package com.test;

import java.util.Arrays;

// solution(A) that, given an array A consisting of N integers, 
// returns the biggest value X, which occurs in A exactly X times. 
// If there is no such value, the function should return 0. 
// Examples: 1. Given A=[3,8,2,3,3,2], the function should return 
// 3 . The value 2 occurs exactly two times and the value 3 occurs exactly three times, 
// so they both meet the task conditions. The value 8 occurs just once,
// thus it does not meet the task conditions. The maximum of 2 and 3 is 3. 2. 
// Given A=[7,1,2,8,2], the function should return 2 . The value 1 occurs exactly one time; 
// the value 2 occurs exactly two times. 3. Given A=[3,1,4,1,5], the function should return 0 . 
// There is no value which meets the task conditions. 4. Given A=[5,5,5,5,5], 
// the function should return 5. Write an efficient algorithm for 
// the following assumptions: - N is an integer within the range [1..100,000]; 
// - each element of array A is an integer within the range [1.1,000,000,000]

public class LargestNumber {
	public int findX(int[] arr) {
		// Sorting the array.
		Arrays.sort(arr);

		int curr = arr[arr.length - 1], temp = 0, ans = 0;

		// Calculating the frequency of each element
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == curr) {
				temp++;
			} else {
				if (arr[i + 1] == temp) {
					ans = temp;
					return ans;
				} else {
					temp = 1;
					curr = arr[i];
				}
			}
		}

		// If we have not returned anyhting yet, so there is a chance that first element
		// is our answer
		if (arr[0] == temp) {
			ans = temp;
		} else {
			ans = 0;
		}

		// Returning the final answer
		return ans;
	}
	
	public static void main(String[] args) {
		
		LargestNumber sol = new LargestNumber();
		
		sol.testOutput(new int[]{1, 2, 2,3,3,3},3);
		sol.testOutput(new int[]{7,1,2,8,2},2);
		sol.testOutput(new int[]{3,1,4,1,5},0);
		sol.testOutput(new int[]{5,5,5,5,5},5);
		
	}

	private void testOutput(int[] in, int exp) {
		LargestNumber sol = new LargestNumber();
		if (sol.findX(in) == exp) {
			System.out.println("PASS");
		} else {
			System.out.println("Expected/Got:" + exp + " / " + sol.findX(in));
		}
	}
}
