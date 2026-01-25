package dsa.array;

public class TwoSumUsingPointersFirstvariant {
	
	public static boolean check(int arr[],int k) {
		int n = arr.length;
		int low = 0,high=n-1;
		
		while(low<=high) {
			if(arr[low]+arr[high] == k) {
				return true;
			}
			else if(arr[low]+arr[high] <k) {
				low++;
			}
			else {
				high--;
			}
			
		}
		return false;
	}
	public static void main(String args[]) {
		int arr[] = {1,3,8,5,6};
		int k = 14;
		boolean result = check(arr, k);
		System.out.println("This is the answer for variant 1: " + (result ? "Yes" : "No"));
		
	}

}
