/*
 * Time Complexity: O(N * log(max(a[]))),
 * Space Complexity: O(1) 
 */
package dsa.array;

public class KokoEatingBananasBinarySearch {
	public static int findMax(int[] arr) {
		int maxElement = arr[0];
		int n = arr.length;
		for(int i=1;i<n;i++) {
			maxElement = Math.max(arr[i], maxElement);
		}
		return maxElement;
	}
	public static int totalTimeTaken(int[] arr,int hourly) {
		int n = arr.length;
		int timeTaken=0;
		int currValue;
		for(int i=0;i<n;i++) {
			
			currValue = arr[i];
			while(currValue>0) {
				timeTaken++;//
				currValue-=hourly;
			}
		}
		
		return timeTaken;
	}
	public static int minimumRateToEatBananas(int[] v,int h) {
		int low = 1;
		int high = findMax(v);
		while(low<=high) {
			int mid = (low+high)/2;
			int totalHours = totalTimeTaken(v, mid);
			if(totalHours>h) {
				low = mid+1;
			}
			else if(totalHours<h){
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		return low;
	}
	

	public static void main(String[] args) {
		int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");

	}

}
