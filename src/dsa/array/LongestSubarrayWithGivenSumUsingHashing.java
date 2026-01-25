package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithGivenSumUsingHashing {
	public static long findLongestSubArray(int[] arr, int k) {

		long n = arr.length;
		long maxLen = 0;
		Map<Long, Integer> preSumMap = new HashMap<>();
		long sum =0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(sum == k) {
				maxLen = Math.max(maxLen, i+1);
			}
			long rem = sum-k;
			if(preSumMap.containsKey(rem)) {
				int len = i-preSumMap.get(rem);
				maxLen = Math.max(maxLen, len);
			}
			if(!preSumMap.containsKey(sum)) {
				preSumMap.put(sum, i);
			}
		}
		return maxLen;
		
		
	}
	public static void main(String args[]) {
		int[] arr = {1,2,3,5,7,9};
		int k=10;
		long result = findLongestSubArray(arr,k);
		System.out.println("The longest subarray with sume 10 is "+result);
		
	}

}
