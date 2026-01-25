package dsa.array;

public class SearchInsertPosition {
	public static int searchPosition(int[] arr,int target) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int ans= n;
		while (low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]>= target) {
				ans = mid;
				high = mid-1;
			}
				
			else if(arr[mid]<target)
				low = mid+1;
			
			
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {3, 4, 7, 12, 18};
        int  x = 15;
        int ind = searchPosition(arr, x);
        System.out.println("The insert position is the index: " + ind);

	}

}
