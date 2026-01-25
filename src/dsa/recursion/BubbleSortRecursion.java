package dsa.recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
	public static void main(String[] args) {
		int arr[]= {13,46,24,52,20,9};
		sort(arr,arr.length);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}
	public static void sort(int[] arr, int length) {
		if(length==1) {
			return;
		}
		else {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		sort(arr,length-1);
		
	}

}
