package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashingSecondvariant {
	public static int[] check(int arr[], int k) {
		int n = arr.length;
		int ans[] = new int[2];
		ans[0]=ans[1]=-1;
		Map<Integer, Integer> mpp = new HashMap<>();
		for(int i=0;i<n;i++) {
			int num = arr[i];
			int moreNeeded = k-num;
			if(mpp.containsKey(moreNeeded)) {
				 ans[0]=num;
				 ans[1]=moreNeeded;
			}
			mpp.put(num, i);
		}
		return ans;
		
	}
	public static void main(String args[]) {
		int arr[] = {1,3,8,5,6};
		int k = 14;
		int[] ans = check(arr, k);
		System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                + ans[1] + "]");
		
	}

}
