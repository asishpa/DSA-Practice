/*
 * Time Complexity: O(N^3*log(M)), where N = size of the array, M = no. of elements in the set.
 * Space Complexity: O(2 * no. of the quadruplets)+O(N)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBetterApproach {
	public static List<List<Integer>> fourSum(int[] arr, int target) {
		int n = arr.length;
		Set<List<Integer>> st = new HashSet<>();
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				Set<Integer> hashSet = new HashSet<>();
				for (int k = j + 1; k < n; k++) {
					int fourth = target - (arr[i] + arr[j] + arr[k]);

					if (hashSet.contains(fourth)) {

						List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
						temp.sort(null);
						st.add(temp);
					}

					hashSet.add(arr[k]);

				}
			}

		}
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		List<List<Integer>> ans = fourSum(arr, target);
		for (List<Integer> it : ans) {
			System.out.print("[");
			for (Integer i : it) {
				System.out.print(i + " ");
			}
			System.out.print("] ");
		}

		System.out.println();

	}

}
