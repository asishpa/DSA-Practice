/*
 * Complexity analysis same as split array
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PaintersPartitionBruteForce {
	public static int findNoOfPartitions(ArrayList<Integer> arr,int maxSum ) {
		int partitions = 1;
		int currentSum = 0;
		for(int i=0;i<arr.size();i++) {
			if(currentSum + arr.get(i)<=maxSum) {
				currentSum+=arr.get(i);
			}
			else {
				partitions++;
				currentSum = arr.get(i);
			}
		}
		return partitions;
	}

	public static int findMinimumTime(ArrayList<Integer> arr,int partitions) {
		int low = Collections.max(arr);
		int high = arr.stream().mapToInt(Integer::intValue).sum();
		for(int i=low;i<=high;i++) {
			if(findNoOfPartitions(arr,i)==partitions) {
				return i;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40));
		int partitions = 2;
		int ans = findMinimumTime(arr,partitions);
		System.out.println("The answer is:"+ans);
	}

}
