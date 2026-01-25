/*
 * The time complexity is : O(N^2)
 * The space complexity is : O(1)
 */
package dsa.array;

public class FindRepeatingAndMissingNumberBruteForce {
	public static int[] findMissingAndRepeatingNumber(int[] arr) {
		int n = arr.length;
		int missing=-1, repeating=-1;
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(arr[j]==i) {
					count++;
				}
				
			}
			if(count==1) {
				repeating=i;
			}
			if (count==0) {
				missing=i;
			}
			
		}
		int[] ans = {missing,repeating};
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {3,1,2,5,3};
		int[] ans = findMissingAndRepeatingNumber(arr);
		System.out.println("The missing number is "+ans[0]);
		System.out.println("The repeating number is "+ans[1]);

	}

}
