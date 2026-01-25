package dsa.array;

public class KadaneAlgirithmOptimalSolution {
	public static int findElement(int[] arr) {
		int n = arr.length;
		int maxi = Integer.MIN_VALUE;
		int sum = 0;
		int ansStart =0,ansEnd=0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum > maxi) {
				maxi = sum;
				ansEnd=i-1;
			}
			if (sum < 0) {
				sum = 0;
				ansStart=i+1;
				ansEnd = i+1;
			}
		}
		
		System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
		return maxi;
	}

	public static void main(String args[]) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int element = findElement(arr);
		System.out.println("The element is " + element);

	}

}
