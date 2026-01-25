/*
 * Time complexity: O(2N)
 * Space complexity: O(1)
 */
package dsa.array;

public class FindRepeatingAndMissingNumberBetterApproach {
	public static int[] findMissingAndRepeatingNumber(int[] arr) {
		int n = arr.length;
		int[] hash = new int[n+1];
		int missing=-1, repeating=-1;
		for(int i=0;i<n;i++) {
			hash[arr[i]]++;
		}
		for(int i=1;i<=n;i++) {
			if(hash[i]==2)
				repeating=i;
			if(hash[i]==0)
				missing=i;
			if(repeating!=-1 && missing!=-1) {
				break;
			}
		}
		int[] ans = {missing,repeating};
		return ans;
	}
	
	public static void main(String args[]) {
		int[] arr = {3,1,2,5,3};
		int[] ans = findMissingAndRepeatingNumber(arr);
		System.out.println("The missing number is "+ans[0]);
		System.out.println("The repeating number is "+ans[1]);
		
	}

}
