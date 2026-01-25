/*
 * Time complexity: O(log N)
 * space complexity: O(1)
 */
package dsa.array;

public class BinarySearchBruteForce {
	public static int binarySearch(int[] arr, int target) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while (low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]== target)
				return mid;
			else if(arr[mid]<target)
				low = mid+1;
			else 
				high = mid-1;
			
		}
		return -1;
	}
		

	public static void main(String[] args) {
		int[] a = {2, 3, 5, 7, 10, 12, 15};
        int target = 15;
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }

	}


