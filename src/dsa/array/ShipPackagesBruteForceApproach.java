/*
 * Time Complexity: O(N * (sum(weights[]) - max(weights[]) + 1)), 
 * Space Complexity: O(1)
 */
package dsa.array;

//Find out the least-weight capacity so that you can ship all the packages within 'd' days.
public class ShipPackagesBruteForceApproach {
	public static int calculateDays(int[] arr,int capacity) {
		int n = arr.length;
		int noOfDays=0;
		int load = 0;
		for(int i=0;i<n;i++) {
			if((load+arr[i])>capacity) {
				noOfDays+=1;
				load = arr[i];			
			}
			else {
				load +=arr[i]; // 
			}
		}
		return noOfDays+1;
		
	}
	public static int leastWeightCapacity(int[] arr,int d) {
		int n = arr.length;
		int minCapacity = Integer.MAX_VALUE;
		int maxCapacity = 0;
		for(int i=0;i<n;i++) {
			minCapacity = Math.min(minCapacity, arr[i]);
			maxCapacity+=arr[i];
		}
		for(int j=minCapacity;j<=maxCapacity;j++) {
			int noOfDays = calculateDays(arr,j);
			System.out.println("no. of days:"+noOfDays);
			if(noOfDays<=d)
				return j;
		}
		return -1;
	}
	public static void main(String[] args) {
		 int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
	     int d = 5;
	     int ans = leastWeightCapacity(weights, d);
	     System.out.println("The minimum capacity should be: " + ans);
	}
}
