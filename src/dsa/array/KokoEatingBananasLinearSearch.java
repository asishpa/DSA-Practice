/*Time Complexity: O(max(a[]) * N),
 * Space Complexity: O(1)
 */
package dsa.array;

public class KokoEatingBananasLinearSearch {
	//to find the maximum element from array 
	public static int findMax(int[] arr) {
		int maxElement = Integer.MIN_VALUE;
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
		int maxElement = findMax(v);
		for (int i = 1; i <= maxElement; i++) {
            int reqTime = totalTimeTaken(v, i);
            if (reqTime <= h) {
                return i;
            }
        }
		return maxElement;
	}

	public static void main(String[] args) {
		int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
		

	}

}
