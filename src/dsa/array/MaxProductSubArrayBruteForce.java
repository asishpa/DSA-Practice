/*
 * Time Complexity: O(N^3)
 * Space Complexity: O(1) 
 */
package dsa.array;

public class MaxProductSubArrayBruteForce {

	public static int findMaxProduct(int[] arr) {
		int n = arr.length;
		int result = 1;
		
		for(int i=1;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				int prod=1;
				for(int k=i;k<=j;k++) {
					prod*=arr[k];
					
				}
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
