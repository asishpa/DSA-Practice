/*
 * Time Complexity: O(n^2)
 * Space complexity: O(1)
 */
package dsa.array;

public class NoOfSubArraysWithXORBetterApproach {
	public static int subarraysWithXorK(int arr[], int k) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			int xorr = 0;
			for (int j = i; j < n; j++) {
				
				xorr = xorr ^ arr[j];
				if (xorr == k)
					count++;
			}
		}
		return count;
	}

	public static void main(String args[]) {

		int arr[] = { 4, 2, 2, 6, 4 };
		int k = 6;
		int ans = subarraysWithXorK(arr, k);
		System.out.println("The number of subarrays with XOR k is: " + ans);
	}

}
