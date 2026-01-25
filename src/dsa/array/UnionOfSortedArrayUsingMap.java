package dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UnionOfSortedArrayUsingMap {
	
	public static ArrayList<Integer> unionOfArray(int arr1[],int arr2[]) {
		Map<Integer, Integer> freq = new HashMap<>();
		ArrayList<Integer> union = new ArrayList<>();
		for(int i =0;i<arr1.length;i++) {
			freq.put(arr1[i], freq.getOrDefault(arr1[i], 0)+1);
		}
		for(int i =0;i<arr2.length;i++) {
			freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
		}
		for(int key: freq.keySet()) {
			union.add(key);
		}
		return union;
	}
	public static void main(String args[]) {
		int arr1[] = {1,3,5,3,4};
		int arr2[] = {1,7,8,9,3};
		ArrayList<Integer> union = unionOfArray(arr1,arr2);
		System.out.println("Union of arr1 and arr2 is ");
		  for (int val: union)
		    System.out.print(val+" ");
	}

}
