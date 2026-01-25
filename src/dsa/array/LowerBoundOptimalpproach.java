/*
 * Time complexity: O(log N)
 * Space complexity: O(1)
 */
package dsa.array;

public class LowerBoundOptimalpproach {
	
	public static int lowerBound(int[] arr, int target) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int ans = n;
		while (low<high) {
			int mid = (low+high)/2;
			if(arr[mid]>= target) {
				ans = mid;
				high = mid-1;
			}
			
			else 
				low = mid+1;
			
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3, 4, 7, 12, 18};
        int  x = 9;
        int ind = lowerBound(arr, x);
        System.out.println("The lower bound is the index: " + ind);
		

	}

}
