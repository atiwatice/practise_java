package com.practise;

public class Binary2 {
	public static int solution(int A, int B, int C) {
		int count = 0;
		int maxInt = 1073741823; // Maximum 30-bit integer

		// Iterate through all possible 30-bit integers
		for (int i = 0; i <= maxInt; i++) {
			// Check if the integer conforms to at least one of A, B, or C
			if ((i & A) == A || (i & B) == B || (i & C) == C) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		
		int A = 1073741727; // Example A
		int B = 1073741631; // Example B
		int C = 1073741679; // Example C
		int result = solution(A, B, C);
		System.out.println(result); // Output: 8
	}
}
