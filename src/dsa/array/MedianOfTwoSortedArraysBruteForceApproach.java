/*
 * Time Complexity: O(N1+N2)
 * Space Complexity: O(N1+N2)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArraysBruteForceApproach {
	public static double findMedianOfSortedArrays(int[] arr1,int[] arr2) {
		int i=0,j=0;
		List<Integer> merged = new ArrayList<>();
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				merged.add(arr1[i]);
				i++;
			}
			else {
				merged.add(arr2[j]);
				j++;
			}
		}
		while(i<arr1.length) {
			merged.add(arr1[i++]);
		}
		while(j<arr2.length) {
			merged.add(arr2[j++]);
		}
		int n = merged.size();
		if(n%2==0)
			return (merged.get(n/2-1)+merged.get(n/2))/2.0;
		else
			return merged.get(n/2);
	}

	public static void main(String[] args) {
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4};
		double median = findMedianOfSortedArrays(arr1,arr2);
		System.out.println("The median of the combined  sorted array is "+median);
		
		
	}

}
