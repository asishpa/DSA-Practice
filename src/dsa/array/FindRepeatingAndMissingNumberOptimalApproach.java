/*
 * Time Complexity: O(N)
 * Space complexity: O(1
 */
package dsa.array;

public class FindRepeatingAndMissingNumberOptimalApproach {
	public static int[] findMissingAndRepeatingNumber(int[] arr) {
		int n = arr.length;
		long SN= ((n*(n+1))/2);
		long S2N= (n*(n+1)*(2*n+1)/6);
		long S=0,S2=0;
		for(int i=0;i<n;i++) {
			S+=arr[i];
			S2 += (long)arr[i] * (long)arr[i];
		}
		//X = repeated twice and Y = missing 
		//X-Y = val1
		long val1 = S-SN;
		//Y+X = val2
		long val2 = (S2-S2N)*val1;
		long X = (val1+val2)/2;
		long Y = val2-X;
		int[] ans = {(int)Y,(int)X};
		return ans;
		
	}
	public static void main(String args[]) {
		int[] arr = {3,1,2,5,3};
		int[] ans = findMissingAndRepeatingNumber(arr);
		System.out.println("The missing number is "+ans[0]);
		System.out.println("The repeating number is "+ans[1]);
		
	}

}
