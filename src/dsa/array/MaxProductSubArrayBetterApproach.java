/*
 * Time complexity: O(N^2)
 * Space Complexity: O(1)
 */
package dsa.array;

public class MaxProductSubArrayBetterApproach {
	public static int findMaxProduct(int[] arr) {
		int n = arr.length;
		int result = 1;
		
		for(int i=0;i<n;i++) {
			int prod=arr[i];
			for(int j=i+1;j<n;j++) {
				prod*=arr[j];
				result = Math.max(result, prod);
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,-3,0,-4,-5};
		int result = findMaxProduct(arr);
		System.out.println("The max product is :"+result);

	}

}
