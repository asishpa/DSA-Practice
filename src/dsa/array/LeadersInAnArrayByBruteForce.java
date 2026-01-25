package dsa.array;

import java.util.ArrayList;

public class LeadersInAnArrayByBruteForce {
	public static ArrayList<Integer> findLeadersInAnArray(int[] arr){
		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<n;i++) {
			boolean leader = true;
			 for(int j=i+1;j<n;j++) {
				 if(arr[i] <arr[j]) {
					 leader = false;
					 break;
				 }
			 }
			 if(leader)
				 ans.add(arr[i]);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,1,5,4,3,0};
		ArrayList<Integer> ans = findLeadersInAnArray(arr);
		for (int i = 0; i < ans.size(); i++) {
		    System.out.print(ans.get(i)+" ");
		  }


	}

}
