/*
 * Time Complexity: O(N3 * log(no. of unique triplets))
 * Space Complexity: O(2 * no. of the unique triplets) 
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBruteForce {
	static List<List<Integer>> triplet(int[] arr){
		Set<List<Integer>> st = new HashSet<>();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if((arr[i]+arr[j]+arr[k])==0) {
						List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
						Collections.sort(temp);
						st.add(temp);
						
					}
				}
			}
			
		}
		List<List<Integer>> ans = new ArrayList<>(st);
		return ans;
	}

	public static void main(String[] args) {
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
