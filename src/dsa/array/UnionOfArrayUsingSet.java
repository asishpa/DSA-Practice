package dsa.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrayUsingSet {
	public static ArrayList<Integer> unionOfArray(int arr1[],int arr2[]) {
		Set<Integer> s = new HashSet<>();
		ArrayList<Integer> union = new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			s.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			s.add(arr2[i]);
		}
		for(int it:s) {
			union.add(it);
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
