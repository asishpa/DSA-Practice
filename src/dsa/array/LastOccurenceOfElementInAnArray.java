package dsa.array;

class LastOccurenceOfElementInAnArray {
	public static int findLastOccurence(int[] arr,int target) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > target) {
				
				high = mid - 1;
			}

			else if (arr[mid] < target) {
				low = mid + 1;
				
			}
			else {
				ans = mid;
				low=mid+1;
				
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 4,7, 12, 18 };
		int x = 4;
		int result = findLastOccurence(arr, x);
		if(result!=-1)
			System.out.println("The last occurence of "+x+" in an array is : "+result);
		else
			System.out.println("The element did not occur in the array  ");
		

	}

}
