/*
 * Time complexity: O(N^2)
 * Space Complexity: O(1)
 */
package dsa.array;

public class CountReversePairsInAnArrayBruteForce {

	public static int countReversePairs(int[] arr) {
		int n = arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(arr[i]>(2*arr[j])) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {3,2,1,4};
		int count =countReversePairs(arr);
		System.out.println("count of reverse pairs is "+count);
		

	}

}
