package dsa.array;

public class FloorAndCeilingInSortedArray {

	public static int findFloor(int[] arr, int target) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int ans = n;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > target) {

				high = mid - 1;
			}

			else if (arr[mid] <= target)
				ans = mid;
				low = mid + 1;
				

		}
		return ans;
	}

	public static int findCeiling(int[] arr, int target) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int ans = n;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] >= target) {
				ans = mid;
				high = mid - 1;
			}

			else if (arr[mid] < target)
				
				low = mid + 1;
				

		}
		return ans;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 7, 12, 18 };
		int x = 9;
		int floor = findFloor(arr, x);
		int ceiling = findCeiling(arr, x);
		System.out.println("The floor position is the index: " + floor);
		System.out.println("The ceiling position is the index: "+ceiling);

	}

}
