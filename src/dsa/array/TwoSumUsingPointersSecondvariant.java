package dsa.array;


public class TwoSumUsingPointersSecondvariant {
	public static int[] check(int arr[],int k) {
		int n = arr.length;
		int low = 0,high=n-1;
		int[] ans = new int[2];
		ans[0]=ans[1] =-1;
		
		while(low<=high) {
			if(arr[low]+arr[high] == k) {
				ans[0]=low;
				ans[1]=high;
				return ans;
			}
			else if(arr[low]+arr[high] <k) {
				low++;
			}
			else {
				high--;
			}
			
		}
		return ans;
	}
	public static void main(String args[]) {
		int arr[] = {1,3,8,5,6};
		int k = 14;
		int[] ans = check(arr, k);
		System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                + ans[1] + "]");
		
	}

}
