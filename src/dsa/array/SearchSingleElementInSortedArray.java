/*
 * Time complexity : O(log N)
 * Space complexity: O(1)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchSingleElementInSortedArray {
	public static int findSingle(ArrayList<Integer> arr) {
		int n = arr.size();
		if(n==1)
			return arr.get(0);
		if(!arr.get(0).equals(arr.get(1)))
			return arr.get(0);
		if(!arr.get(n-1).equals(arr.get(n-2)))
			return arr.get(n-1);
		int low = 1;
		int high = n-2;
		while(low<=high) {
			int mid = (low+high)/2;
			//if mid itself is the single element
			if(!arr.get(mid).equals(arr.get(mid+1)) && !arr.get(mid).equals(arr.get(mid-1)))
				return arr.get(mid);
			//eliminate left half
			if((arr.get(mid)%2==1 && arr.get(mid).equals(arr.get(mid-1))) || (arr.get(mid)%2==0 && arr.get(mid).equals(arr.get(mid+1)))) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}	
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int ans = findSingle(arr);
        System.out.println("The single element is: " + ans);

	}

}
