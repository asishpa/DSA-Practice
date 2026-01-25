package dsa.array;

public class KadaneAlgirithmByBruteForce {
	public static int findElement(int[] arr) {
		int n = arr.length;
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {// start index
			int sum = 0;
			for (int j = i; j < n; j++) {// end index
				sum += arr[j];
				maxi = Math.max(maxi, sum);
			}

			

		}
		return maxi;
	}

	public static void main(String args[]) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int element = findElement(arr);
		System.out.println("The element is " + element);
	}

}
