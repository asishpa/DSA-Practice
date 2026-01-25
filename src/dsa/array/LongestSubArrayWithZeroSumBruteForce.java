/*
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
package dsa.array;

public class LongestSubArrayWithZeroSumBruteForce {
	
	public static int find(int[] arr) {
		int n = arr.length;
		int max = 0;
		for(int i=0;i<n;i++) {
			int sum =0;
			for(int j=i;j<n;j++) {
				sum += arr[j];
				if(sum==0) {
					max = Math.max(max, j-i+1);
				
			}
			}
									
		}
		return max;
	}
	public static void main(String[] args) {
		int a[]= {9, -3, 3, -1, 6, -5};
		System.out.println("The length of the longest subarray with zero sum is :"+find(a));
		
		
	}

}
