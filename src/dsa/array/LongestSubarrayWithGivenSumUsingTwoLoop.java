package dsa.array;

public class LongestSubarrayWithGivenSumUsingTwoLoop {
	public static int findLongestSubArray(int[] arr, int k) {

		int n = arr.length;
		int len = 0;
		for (int i = 0; i < n; i++) { // start index of array
			int s = 0;
			for (int j = i; j < n; j++) {// end index of array
				s += arr[j];

				if (s == k) {
					len = Math.max(len, j - i + 1);
				}

			}
		}
		return len;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 5, 7, 9 };
		int k = 10;
		int result = findLongestSubArray(arr, k);
		System.out.println("The longest subarray with sume 10 is " + result);

	}

}
