package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashingFirstvariant {
	public static boolean check(int arr[], int k) {
		int n = arr.length;
		Map<Integer, Integer> mpp = new HashMap<>();
		for(int i=0;i<n;i++) {
			int num = arr[i];
			int moreNeeded = k-num;
			if(mpp.containsKey(moreNeeded)) {
				 return true;
			}
			mpp.put(num, i);
		}
		return false;
		
	}
	public static void main(String args[]) {
		int arr[] = {1,3,8,5,6};
		int k = 14;
		boolean result = check(arr, k);
		System.out.println("This is the answer for variant 1: " + (result ? "Yes" : "No"));
	}

}
