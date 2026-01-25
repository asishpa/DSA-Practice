/*
 * Time Complexity: O(min(n, m)) + O(n*logn) + O(m*logm)
 * Space Complexity : O(1)
 */
package dsa.array;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpaceOptimalApproachOne {
	public static void merge(long[] arr1, long[] arr2) {
		
		int m = arr2.length;
		int left = arr1.length - 1;
		int right = 0;
		while (left >= 0 && right < m) {
			if (arr1[left] > arr2[right]) {
				long temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				left--;
				right++;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);

	}

	public static void main(String[] args) {
		long[] arr1 = { 1, 4, 8, 10 };
		long[] arr2 = { 2, 3, 9 };
		System.out.print("arr1[] = ");
		merge(arr1, arr2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\narr2[] = ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
