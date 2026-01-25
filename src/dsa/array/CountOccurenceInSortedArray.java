/*
 * Time Complexity: O(2*logN),
 * Space Complexity: O(1)
 */
package dsa.array;

public class CountOccurenceInSortedArray {
	public static int findFirstOccurence(int[] arr,int target) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int first = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > target) {
				
				high = mid - 1;
			}

			else if (arr[mid] < target) {
				low = mid + 1;
				
			}
			else {
				first = mid;
				high = mid - 1;
				
			}

		}
		return first;
	}
	public static int findLastOccurence(int[] arr,int target) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int last = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > target) {
				
				high = mid - 1;
			}

			else if (arr[mid] < target) {
				low = mid + 1;
				
			}
			else {
				last = mid;
				low=mid+1;
				
			}

		}
		return last;
	}
	public static int[] firstAndLastPosition(int[] arr, int k) {
        int first = findFirstOccurence(arr, k);
        if (first == -1) return new int[] { -1, -1};
        int last = findLastOccurence(arr, k);
        return new int[] {first, last};
    }
	
	public static int countOccurence(int arr[], int x) {
        int[] ans = firstAndLastPosition(arr, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

	public static void main(String[] args) {
		int[] arr = { 3, 4, 4, 12, 18 };
		int x = 4;
		int result = countOccurence(arr, x);
		if(result!=-1)
			System.out.println("The element "+x+" occured for "+result+" times in the array ");
		else
			System.out.println("The element did not occur in the array  ");
	}

}
