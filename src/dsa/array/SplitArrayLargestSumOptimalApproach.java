/*
 * Complexity analysis same as book allocation optimal approach 
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SplitArrayLargestSumOptimalApproach {
	public static int findNoOfBlocks(ArrayList<Integer> arr,int maxSum) {
		int blocks = 1;
		int currentSum = 0;
		for(int i=0;i<arr.size();i++) {
			if(currentSum + arr.get(i)<=maxSum) {
				currentSum+=arr.get(i);
			}
			else {
				blocks++;
				currentSum = arr.get(i);
			}
		}
		return blocks;
		
	}
	public static int findLargestSum(ArrayList<Integer> arr,int blocks) {
		int low = Collections.max(arr);
		int high = arr.stream().mapToInt(Integer::intValue).sum();
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(findNoOfBlocks(arr, mid)>blocks) {
				low = mid+1;
			}
			else {
				high = mid -1 ;
			}
		}
		return low;
	}
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		int blocks = 3;
		int ans = findLargestSum(arr,blocks);
		System.out.println("The answer is:"+ans);
	}

}
