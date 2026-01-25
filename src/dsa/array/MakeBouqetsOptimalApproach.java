//Time complexity: O(log(max(arr[])-min(arr[])+1) * N), where {max(arr[]) -> maximum element of the array, min(arr[]) -> minimum element of the array, N = size of the array}.
//Space Complexity: O(1)
package dsa.array;

public class MakeBouqetsOptimalApproach {
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
		int low=Integer.MAX_VALUE;
		int high=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			low = Math.min(low, arr[i]);
			high = Math.max(high,arr[i]);
		}
		while(low<=high) {
			int mid = (low+high)/2;
			if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
		}
		return low;
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
