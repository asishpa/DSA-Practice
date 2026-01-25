package dsa.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceOptimalApproach {
	public static int findLongestSubseqence(int[] arr) {
		int n = arr.length;
		int longest= Integer.MIN_VALUE;
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<n;i++) {
			s.add(arr[i]);
		}
		
		for(int it:s) {
			
			if(!s.contains(it-1)) {
				int x =it;
				int count=1;
				while(s.contains(x+1)) {
					count++;
					x++;
				}
				longest = Math.max(count, longest);
			}
			
		}
		return longest;
	}
	
	
	public static void main(String args[]) {
		int arr[] = { 100, 200, 1, 2, 3, 4, 5 };
		int length = findLongestSubseqence(arr);
		System.out.println("The length of longest subsequence is " + length);
	}

}
