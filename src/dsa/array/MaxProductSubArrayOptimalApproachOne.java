/*
 * Time Complexity: O(N)
 * Space complexity: O(1)
 */
package dsa.array;

public class MaxProductSubArrayOptimalApproachOne {

	public static int findMaxProduct(int[] arr) {
		int n = arr.length;
		int result = Integer.MIN_VALUE;
		int pre = 1, suff = 1;
		for(int i=0;i<n;i++) {
			if (pre ==0) pre=1;
			if(suff == 0) suff=1;
			pre *= arr[i];
			suff *= arr[n-i-1];
			result = Math.max(suff, pre);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,0};
		int result = findMaxProduct(arr);
		System.out.println("The max product is :"+result);


	}

}
