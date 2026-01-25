/*
 * Time complexity: O(N*log(N))+O(2*N) 
 * Space complexity: O(N)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubIntervalsBruteForceApproach {

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
			//skip merged intervals
			if(!ans.isEmpty() && end<= ans.get(ans.size()-1).get(1)) {
				continue;
			}
			for(int j=i+1;j<n;j++) {
				if(arr[j][0]<end) {
					end = Math.max(arr[j][1], end);
					
				}
				else {
					break;
				}
			}
			ans.add(Arrays.asList(start,end));
			
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
