/*
 * Time Complexity: O((max(arr[])-min(arr[])+1) * N), where {max(arr[]) -> maximum element of the array, min(arr[]) -> minimum element of the array, N = size of the array}.
 * Space Complexity: O(1)
 */
package dsa.array;

public class MakeBouqetsBruteForceApproach {
	public static boolean possible(int[] arr,int i,int k,int m) {
		int n = arr.length;		
		int noOfBoq=0;
		int count=0;
		for(int j=0;j<n;j++) {			
			if(arr[j]<=i) {
				count++;				
			}
			else {	
				noOfBoq += count/k;
				count=0;
			}
		}
		noOfBoq += count/k;
		if(noOfBoq>=m)
			return true;
		else
			return false;	
	}
	public static int roseGarden(int[] arr,int k,int m) {
		int n = arr.length;
		int mini=Integer.MAX_VALUE;
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			mini = Math.min(mini, arr[i]);
			maxi = Math.max(maxi,arr[i]);
		}		
		for(int i=mini;i<=maxi;i++) {
			if(possible(arr,i,k,m))
				return i;
		}
		return -1;	
	}
	public static void main(String[] args) {
		int[] arr = {7, 7, 7, 7, 7,13, 11, 12, 7};
        int k = 3;//no. of adjacent flowers req
        int m = 2;//no. of bouqets req
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make the required no. of bouquets on day " + ans);

	}

}
