package dsa.array;

public class LongestSubarrayWithGivenSumUsingPointers {
	public static long findLongestSubArray(int[] arr, int k) {
		
		long n = arr.length;
		long maxLen = 0;
		int left = 0,right =0;
		int sum = arr[0];
		while(right <n) {
			while(left <=right && sum>k) {
				sum-=arr[left];
				left++;
			}
			if(sum==k) {
				maxLen = Math.max(maxLen, right-left+1);
			}
			right++;
			if(right<n) {
				sum+=arr[right];
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
