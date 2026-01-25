/*
 * Time Complexity: O(N),
 * Space Complexity: O(N), 
 */
package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithZeroSumOptimalApproach {
	
	static int find(int[] arr) {
		int n = arr.length;
		int sum =0;
		int max =0;
		Map<Integer, Integer> set = new HashMap<>();
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(sum == 0) {
				max=i+1;
			}
			else {
				if (set.get(sum)!=null) {
					max = Math.max(max, i-set.get(sum));
					
				}
				else {
					set.put(sum, i);
				}
			}
		}
		return max;
	}
	public static void main(String args[]) {
		int a[]= {9, -3, 3, -1, 6, -5};
		System.out.println("The length of the longest subarray with zero sum is :"+find(a));		
	}

}
