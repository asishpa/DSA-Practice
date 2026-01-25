/*
 * Time complexity: O(N^2)
 * Space complexity: O(1)
 */
package dsa.array;

public class CountInversionsInAnArrayBruteForce {
	public static int countInversions(int[] arr) {
		int n = arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {5,3,2,1,4};
		int count =countInversions(arr);
		System.out.println("count of inversions is "+count);

	}

}
