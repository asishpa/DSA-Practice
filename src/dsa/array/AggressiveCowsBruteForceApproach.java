/*
 * Time Complexity: O(NlogN) + O(N *(max(stalls[])-min(stalls[]))),
 * Space Complexity: O(1) 
 */
package dsa.array;

import java.util.Arrays;

public class AggressiveCowsBruteForceApproach {
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
		Arrays.sort(stalls);
		int last = stalls[n-1] - stalls[0];
		for (int i = 1; i <= last; i++) {
			if (canWePlaceCows(stalls,i,k)==false) {
				return(i-1);
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
	}

}
