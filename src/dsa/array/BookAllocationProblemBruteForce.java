/*
 * Space Complexity: O(1)
 * Time Complexity: O(N * (sum(arr[])-max(arr[])+1)), where N = size of the array, sum(arr[]) = sum of all array elements, max(arr[])
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BookAllocationProblemBruteForce {
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
		int low = Collections.max(arr);
		int high = arr.stream().mapToInt(Integer::intValue).sum();
		if(arr.size()< students)
			return -1;
		for(int maxPages=low;maxPages<=high;maxPages++) {
			if(noOfStudents(arr,maxPages) == students) {
				return maxPages;
			}
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
