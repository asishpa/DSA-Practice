/*
 * Time Complexity: O(N3),
 * Space Complexity: O(1)
 */
package dsa.array;

public class SubarraySumEqualsKBruteForce {

	static int countSubarray(int[] arr, int total) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;

				for (int k = i; k <= j; k++) {

					sum += arr[k];

				}

				if (sum == total) {
					count++;

				}
			}

		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4 };
		int total = 6;

		int count = countSubarray(arr, total);
		System.out.println("The no. of subarray with sum equals to " + total + " is " + count);

	}

}
