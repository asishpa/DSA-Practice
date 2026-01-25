/*
 * Time Complexity: O(N1+N2)
 * Space Complexity: O(1)
 */
package dsa.array;

public class MedianOfTwoSortedArraysBetterApproach {
	public static double findMedianOfSortedArrays(int[] arr1,int[] arr2) {
		int i=0,j=0,cnt=0;
		int n = arr1.length+arr2.length;
		int ind2 = (n/2);
		int ind1 = ind2-1;
		int ind1el=-1;
		int ind2el=-1;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				if(cnt==ind1) ind1el=arr1[i];
				if(cnt==ind2) ind2el=arr1[i];
				i++;
			}
			else {
				if(cnt==ind1) ind1el=arr2[j];
				if(cnt==ind2) ind2el=arr2[j];
				j++;
			}
			cnt++;
		}
		while(i<arr1.length) {
			if(cnt==ind1) ind1el=arr1[i];
			if(cnt==ind2) ind2el=arr1[i];
			i++;
		}
		while(j<arr2.length) {
			if(cnt==ind1) ind1el=arr2[j];
			if(cnt==ind2) ind2el=arr2[j];
			j++;
		}
		
		if(n%2==1)
			return (double)ind2el;
		else
			return (ind1el+ind2el)/2.0;
	}
	public static void main(String args[]) {
		
		int[] arr1 = {1,3,5};
		int[] arr2 = {2,4};
		double median = findMedianOfSortedArrays(arr1,arr2);
		System.out.println("The median of the combined  sorted array is "+median);
		
	}

}
