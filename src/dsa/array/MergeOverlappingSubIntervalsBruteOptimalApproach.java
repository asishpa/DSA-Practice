/*
 * Time Complexity: O(N*logN)+O(N)
 * Space complexity: O(N)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubIntervalsBruteOptimalApproach {
	public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr){
	
		int n = arr.length;
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				// TODO Auto-generated method stub
				return a[0]-b[0];
			}
			
		});
		List<List<Integer>> ans = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int start = arr[i][0];
			int end = arr[i][1];
			if(ans.isEmpty()) {
				ans.add(Arrays.asList(start,end));
			}
			else {
				if(ans.get(ans.size()-1).get(1)>start) {
					end = Math.max(ans.get(ans.size()-1).get(1), end);
					
					ans.set(ans.size()-1, Arrays.asList(ans.get(ans.size()-1).get(0),end));
					
				}
				else {
					ans.add(Arrays.asList(start,end));
				}
				
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,3},{2,6},{8,10},{9,12},{15,18}};
		List<List<Integer>> sorted = mergeOverlappingIntervals(arr);
		System.out.println("The merged intervals are:");
        System.out.println(sorted);
		

	}

}
