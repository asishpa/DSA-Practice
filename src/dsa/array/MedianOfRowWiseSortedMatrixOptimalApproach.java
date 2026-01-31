/*
 * Time Complexity: O(rows × log(max - min) × log(cols)), Binary search runs on the value space from min to max of the matrix and for each mid in binary search, we count how many numbers are less than or equal to mid
 * Space Complexity: O(1)
 * 
 */
package dsa.array;

public class MedianOfRowWiseSortedMatrixOptimalApproach {
	public static int lessThanEqual(int[] matrix,int target) {
		int low = 0, high = matrix.length -1 ;
		while(low<=high) {
			int mid = (low+high)/2;
			if(matrix[mid] <= target) {
				low = mid +1;
			}
			else {
				high = mid -1;
			}
		}
		return low;
		
		
	}
	public static int findMedian(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int low = matrix[0][0];
		int high = matrix[0][cols-1];
		for(int i=0;i<rows;i++) {
			low = Math.min(low, matrix[i][0]);
			high = Math.max(high, matrix[i][cols-1]);
			
		}
		while(low<high) {
			int mid = (low+high)/2;
			int count = 0;
			for(int i = 0;i<rows;i++) {
				count += lessThanEqual(matrix[i],mid);
			}
			if(count < (rows*cols + 1)/2)
				low = mid + 1;
			else
				high = mid;
		}
		return low;
		
	}
	

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 3, 5},
	            {2, 6, 9},
	            {3, 6, 9}
	        };
	        System.out.println("Median: " + findMedian(matrix));
		

	}

}
