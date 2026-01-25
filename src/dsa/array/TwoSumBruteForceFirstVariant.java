package dsa.array;

public class TwoSumBruteForceFirstVariant {
	public static boolean check(int arr[], int k) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] + arr[j] == k) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String args[]) {
		int a[] = { 1, 3, 8, 5, 6 };
		int k = 14;
		boolean result = check(a, k);
		System.out.println("This is the answer for variant 1: " + (result ? "Yes" : "No"));
	}

}
