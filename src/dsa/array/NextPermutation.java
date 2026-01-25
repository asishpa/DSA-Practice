/*
 * Time Complexity = O(3N)
 * Space Complexity = O(1)
 */
package dsa.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

	public static List<Integer> nextPermutation(List<Integer> arr) {
		int n = arr.size();
		int index = -1;
		// find the break point
		for (int i = 0; i < n; i++) {
			if (arr.get(i) < arr.get(i + 1)) {
				index = i;
				break;
			}
		}
		// if no breakpoint then it is already sorted in descending order
		if (index == -1) {
			Collections.reverse(arr);
			return arr;
		} else {
			for (int i = n - 1; i > index; i--) {
				if (arr.get(i) > arr.get(index)) {
					int temp = arr.get(i);
					arr.set(i, arr.get(index));
					arr.set(index, temp);
					break;
				}

			}
		}
		List<Integer>  subList = arr.subList(index+1, n);
		Collections.reverse(subList);
		return arr;

	}

	public static void main(String args[]) {
		List<Integer> arr = Arrays.asList(new Integer[] { 2, 1, 5, 4, 3, 0, 0 });
		List<Integer> ans = nextPermutation(arr);
		System.out.print("The next permutation is: [");
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		System.out.println("]");

	}

}


