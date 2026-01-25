/*
 * Time Complexity: O(min(n1,n2)) where n1 and n2 are the size of the two arrays 
 * Space Complexity: O(1)
 */
package dsa.array;

public class KthElementOfSortedArray {
	public static int findKthElementOfSortedArray(int[] arr1,int[] arr2,int k) {
		int n1 = arr1.length;
		int n2 = arr2.length;
		if(n1>n2) {
			return findKthElementOfSortedArray(arr2,arr1,k);
		}
		int left = k ;
		int low = Math.max(0, k-n2);
		int high = Math.min(k, n1);
		while(low<=high) {
			int mid1 = (low+high) / 2;
			int mid2 = left - mid1;
			int l1 = (mid1==0) ? Integer.MIN_VALUE : arr1[mid1-1];
			int l2 = (mid2==0) ? Integer.MIN_VALUE : arr2[mid2-1];
			int r1 = (mid1==n1) ? Integer.MAX_VALUE : arr1[mid1];
			int r2 = (mid2==n2) ? Integer.MAX_VALUE : arr2[mid2];
			if(l1<=r2 && l2<=r1) {
				return Math.max(l1, l2);
			}
			else if(l1>r2) {
				high = mid1 - 1 ;
			}
			else {
				low = mid1 + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr1 = {2,3,6,7,9};
		int[] arr2 = {1,4,8,10};
		int k = 6;
		int element = findKthElementOfSortedArray(arr1,arr2,k);
		System.out.println("The kth element of the combined  sorted array is "+element);

	}

}
