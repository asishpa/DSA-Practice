package dsa.array;

public class LongestSubarrayWithGivenSumUsingThreeLoop {
	
	public static int findLongestSubArray(int[] arr,int k) {
		
		int n = arr.length;
		int len = 0;
		for(int i=0;i<n;i++) { //start array
			for(int j=i;j<n;j++) {
				int s =0;//end array
				for(int l=i;l<=j;l++) {
					s+=arr[l];
				}
				if(s==k) {
					len = Math.max(len, j-i+1);
				}
				
			}
		}
		return len;
	}
	public static void main(String args[]) {
		int[] arr = {1,2,3,5,7,9};
		int k=10;
		int result = findLongestSubArray(arr,k);
		System.out.println(result);
	}

}
