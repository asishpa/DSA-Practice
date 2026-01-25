package dsa.array;

import java.util.ArrayList;

public class MoveZeroesUsingTempArray {
	
	public static void removeZeroes(int arr[],int n) {
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				temp.add(arr[i]);
			}
		}
			int nz = temp.size();
			for(int i=0;i<nz;i++) {
				arr[i] = temp.get(i);
			}
			for(int i=nz;i<n;i++) {
				arr[i] = 0;
			}
		}
	public static void main(String args[]) {
		int arr[] = {1,0,4,5,0,7};
		int n = arr.length;
		removeZeroes(arr,n);
		System.out.println("After moving the zeroes to right ");
	    for (int i = 0; i < n; i++) {
	      System.out.print(arr[i] + " ");
	    }
		
	}

}
