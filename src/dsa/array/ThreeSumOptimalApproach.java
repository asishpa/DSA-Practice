/*
 * Time Complexity: O(NlogN)+O(N2),
 * Space Complexity: O(1) 
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOptimalApproach {
	public static List<List<Integer>> triplet(int[] arr){
		List<List<Integer>> ans = new ArrayList<>();
		int n = arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(i!=0 && arr[i] == arr[i-1]) continue;
				int j=i+1;
				int k=n-1;
				while(j<k) {
					int sum = arr[i]+arr[j]+arr[k];
					if(sum>0) {
						k--;
					}
					else if(sum<0) {
						j++;
					}
					else {
						List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
						ans.add(temp);
						j++;
						k--;
						while(j<k && arr[j]==arr[j-1]) {
							j++;
						}
						while (j<k && arr[k]==arr[k+1]) {
							k--;						
						}
						
					}
				}
				
			}
		
	
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

