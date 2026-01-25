/*
 * Time Complexity: O(N2 * log(no. of unique triplets)),
 * Space Complexity: O(2 * no. of the unique triplets) + O(N)
 * 
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBetterApproach{
	public static List<List<Integer>> triplet(int[] arr){
		int n = arr.length;
		Set<List<Integer>> st = new HashSet<>();
		for(int i=0;i<n;i++) {
			Set<Integer> hashset = new HashSet<>();
			for(int j=i+1;j<n;j++) {
				int third = 0-arr[i]-arr[j];
				if(hashset.contains(third)) {
					List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
					temp.sort(null);
					st.add(temp);
					
				}
				hashset.add(arr[j]);			
			}
		}
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;	
	}
	public static void main(String args[]) {
		int[] arr = { -1, 0, 1, 2, -1, -4};
		List<List<Integer>> ans = triplet(arr);
		for(List<Integer> it: ans) {
			System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
		}		
		System.out.println();		
	}
}
