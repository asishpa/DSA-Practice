/*
 * Space Complexity: O(1)
 * Time Complexity: O(N * (sum(arr[])-max(arr[])+1)), where N = size of the array, sum(arr[]) = sum of all array elements, max(arr[])
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SplitArrayLargestSumBruteForce {
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
		for(int i=low;i<=high;i++) {
			if(findNoOfBlocks(arr,i)==blocks) {
				return i;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		int blocks = 3;
		int ans = findLargestSum(arr,blocks);
		System.out.println("The answer is:"+ans);

	}

}
