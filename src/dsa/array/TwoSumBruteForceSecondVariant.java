package dsa.array;

public class TwoSumBruteForceSecondVariant {
	public static int[] check(int arr[], int k) {
		int n = arr.length;
		int[] ans = new int[2];
		ans[0]=ans[1]=-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] + arr[j] == k) {
					ans[0]=i;
					ans[1]=j;
					return ans;
				}
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		int a[] = { 1, 3, 8, 5, 6 };
		int k = 14;
		int[] ans = check(a, k);
		System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                + ans[1] + "]");
	}

}
