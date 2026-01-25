package dsa.array;

import java.util.ArrayList;

public class LeadersInAnArrayOptimalApproach {
	public static ArrayList<Integer> findLeadersInAnArray(int[] arr) {
		int n = arr.length;
		int currentSmallest = Integer.MIN_VALUE;
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = n-1;i>=0;i--) {
			if(arr[i]> currentSmallest ) {
				currentSmallest  = arr[i];
				ans.add(currentSmallest);
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 4, 3, 0 };
		ArrayList<Integer> ans = findLeadersInAnArray(arr);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	}

}
