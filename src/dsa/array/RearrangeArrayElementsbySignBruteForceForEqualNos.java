package dsa.array;

import java.util.ArrayList;

public class RearrangeArrayElementsbySignBruteForceForEqualNos {
	public static int[] arrange(int[] arr) {
		int n = arr.length;
		ArrayList<Integer> posNos = new ArrayList<>();
		ArrayList<Integer> negNos = new ArrayList<>();
		for(int i =0;i<n;i++) {
			if(arr[i]>0)
				posNos.add(arr[i]);
			else
				negNos.add(arr[i]);
		}
		for(int i=0;i<n;i++) {
			arr[2*i] = posNos.get(i);
			arr[2*i+1] = negNos.get(i);
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] nos = {1,-2,4,5};
		int[] ans = arrange(nos);
		for(int i=0;i<ans.length;i++) {
			System.out.println(" "+ans[i]);
		}
		
		
	}

}
