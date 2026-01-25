package dsa.array;

import java.util.ArrayList;
/*
 * Time Complexity: O(N * log(sum(arr[])-max(arr[])+1)), where N = size of the array, sum(arr[]) = sum of all array elements, max(arr[]) = maximum of all array elements.
 * Space Complexity: O(1)
 */
import java.util.Arrays;
import java.util.Collections;

public class BookAllocationProblemOptimalApproach {
	
	public static int noOfStudents(ArrayList<Integer> arr,int maxPages) {
		int students = 1;
		long pagesStudent = 0;
		for(int i =0;i<arr.size();i++) {
			if(pagesStudent + arr.get(i)<=maxPages) {
				pagesStudent += arr.get(i);
			}
			else {
				students++;
				pagesStudent = arr.get(i);
			}
		}
		return students;
	}
	public static int findPages(ArrayList<Integer> arr, int students) {
		if(arr.size()< students)
			return -1;
		int low = Collections.max(arr);
		int high = arr.stream().mapToInt(Integer::intValue).sum();
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(noOfStudents(arr, mid)>students)
				low = mid+1;
			else
				high = mid-1;
		}
		
		return low;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25,46,28,49,24));
		int students = 4;
		int ans = findPages(arr,students);
		System.out.println("The answer is:"+ans);

	}

}
