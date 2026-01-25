/*
 *  Time complexity: O(logN),
 *  Space complexity: O(1)
 */
package dsa.array;

public class BinarySearchRecursiveApproach {
	public static int binarySearch(int[] arr,int low,int high, int target) {
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid]==target)
			return mid;
		else if(arr[mid]>target)
			return binarySearch(arr, low, mid-1, target);
		else
			return binarySearch(arr, mid+1, high, target);
	}
	public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }


	public static void main(String[] args) {
		int[] a = {2, 3, 5, 7, 10, 12, 15};
        int target = 15;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);

	}

}
