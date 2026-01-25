package dsa.array;

import java.util.ArrayList;

public class UnionOfArrayUsingPointer {
	public static ArrayList<Integer> unionOfArray(int arr1[], int arr2[]) {
		ArrayList<Integer> union = new ArrayList<>();
		int l1 = arr1.length;
		int l2 = arr2.length;
		int i = 0, j = 0;

		while (i < l1 && j < l2) {
			if (arr1[i] < arr2[j]) {
				if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
			} else if (arr1[i] > arr2[j]) {
				if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
					union.add(arr2[j]);
				}
				j++;
			} else { // arr1[i] == arr2[j]
				if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
					union.add(arr1[i]);
				}
				i++;
				j++;
			}
		}

		while (i < l1) {
			if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
				union.add(arr1[i]);
			}
			i++;
		}

		while (j < l2) {
			if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
				union.add(arr2[j]);
			}
			j++;
		}

		return union;
	}

	public static void main(String args[]) {
		int arr1[] = { 1, 3, 5, 7, 9 };
		int arr2[] = { 2, 7, 8, 9, 10 };
		ArrayList<Integer> union = unionOfArray(arr1, arr2);
		System.out.println("Union of arr1 and arr2 is:");
		for (int val : union)
			System.out.print(val + " ");
	}
}
