/*
 * Time Complexity: O(N^4 * log(no. of unique triplets))
 * Space Complexity : Space Complexity: O(2 * no. of the unique triplets) 
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBruteForce {
	public static List<List<Integer>> fourSum(int[] arr,int target){
		Set<List<Integer>> st = new HashSet<>();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					for(int l=k+1;l<n;l++) {
						if(arr[i]+arr[j]+arr[k]+arr[l]==target) {
							List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
							Collections.sort(temp);
							st.add(temp);
						}
					}
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}
	

	public static void main(String[] args) {
		int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
		int target = 9;
		List<List<Integer>> ans = fourSum(arr,target);
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
