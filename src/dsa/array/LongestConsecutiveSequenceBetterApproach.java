package dsa.array;

import java.util.Arrays;

public class LongestConsecutiveSequenceBetterApproach {
	public static int findLongestSubseqence(int[] arr) {
		Arrays.sort(arr);
		int longest = 1;
		int lastSmaller = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]-1 == lastSmaller) {
				count+=1;
				lastSmaller = arr[i];
			} else if (arr[i] != lastSmaller) {
				count = 1;
				lastSmaller = arr[i];
			}
			longest = Math.max(longest, count);
			
		}
		return longest;
	}

	

	public static void main(String args[]) {
		int arr[] = { 100, 200, 1, 2, 3, 4, 5 };
		int length = findLongestSubseqence(arr);
		System.out.println("The length of longest subsequence is " + length);
	}

}
