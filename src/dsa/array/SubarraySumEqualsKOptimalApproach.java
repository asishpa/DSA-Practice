package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsKOptimalApproach {
	static int countSubarray(int[] arr,int total) {
		int n = arr.length;
		Map<Integer, Integer> mpp = new HashMap<>();
		mpp.put(0, 1);
		int presum=0,count=0;
		for(int i=0;i<n;i++) {
			presum+=arr[i];
			int remove = presum-total;
			count+=mpp.getOrDefault(remove, 0);
			mpp.put(presum, mpp.getOrDefault(presum, 0)+1);
		}
		return count;
	}
	
	public static void main(String args[]) {
		int[] arr = { 3, 1, 2, 4 };
		int total = 6;

		int count = countSubarray(arr, total);
		System.out.println("The no. of subarray with sum equals to " + total + " is " + count);
		
		
	}

}
