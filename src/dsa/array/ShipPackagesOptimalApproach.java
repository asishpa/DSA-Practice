/*
 * Time Complexity: O(N * log(sum(weights[]) - max(weights[]) + 1))
 * Space Complexity: O(1)
 */
package dsa.array;
public class ShipPackagesOptimalApproach {
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
		int low = minCapacity;
		int high = maxCapacity;
		while(low<=high) {
			int mid = (low+high)/2;
			int noOfDays = calculateDays(arr, mid);
			if(noOfDays<=d) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
			
		}
		return low;
	}

	public static void main(String[] args) {
		int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
	     int d = 5;
	     int ans = leastWeightCapacity(weights, d);
	     System.out.println("The minimum capacity should be: " + ans);
	}

}
