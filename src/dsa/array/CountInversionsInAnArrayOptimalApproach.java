package dsa.array;

import java.util.ArrayList;

public class CountInversionsInAnArrayOptimalApproach {

	public static int merge(int[] arr,int low,int mid,int high) {
		int count=0;
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid+1;
		while (left<=mid && right<=high) {
			if (arr[left]<=arr[right]) {
				temp.add(arr[left]);
				left++;
				
			}
			else {
				
				temp.add(arr[right]);
				count += (mid - left + 1);
				right++;
			}
		}
		while (left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		while (right<=high) {
			temp.add(arr[right]);
			right++;
			
		}
		for (int i = low; i <= high; i++) {
		    arr[i] = temp.get(i - low);
		}

		return count;
	}
	public static int mergeSort(int[] arr,int low,int high) {
		int count = 0;
		
		if (low>=high) 
			return count;
		int mid= (low+high)/2;
		count+=mergeSort(arr, low, mid);
		count+=mergeSort(arr, mid+1, high);
		count+=merge(arr, low,mid, high);
		return count;
	}
	public static int countInversions(int[] arr) {
		int n = arr.length;
		return mergeSort(arr, 0, n-1);
	}
	public static void main(String[] args) {
		int[] arr = {5,3,2,1,4};
		int count =countInversions(arr);
		System.out.println("count of inversions is "+count);
	}

}
