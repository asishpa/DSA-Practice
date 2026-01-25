/*
 * Time complexity: O(N log N) + O(N * log(max(stalls[] - min(stalls[])
 * Space complexity: O(1)
 */
package dsa.array;

public class AggressiveCowsOptimalApproach {
	public static boolean canWePlaceCows(int[] stalls,int dist,int k) {
		int n = stalls.length;
		int cntOfCows = 1;
		int last = stalls[0];
		for(int i=1;i<n;i++) {
			if(stalls[i]-last >=dist) {
				cntOfCows+=1;
				last = stalls[i];
			}
			if(cntOfCows == k) {
				return true;
			}
				
		}
		return false;
	}
	public static int aggressiveCows(int[] stalls,int k) {
		int n = stalls.length;
		int low =1;
		int high = stalls[n-1] - stalls[0];
		while(low<=high) {
			int mid = (low+high)/2;
			if(canWePlaceCows(stalls,mid,k)==true) {
				low = mid+1;
				
			}
			else {
				high = mid-1;
			}
		}
		return high;
	}

	public static void main(String[] args) {
		int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
		

	}

}
