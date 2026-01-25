/*
 * Time Complexity:O(n X logm), where n = given row number, m = given column number. We are using a loop running for n times to traverse the rows. Then we are applying binary search on each row with m columns.
 * Space Complexity: O(1)
 */
package dsa.array;

public class RowWithMaximumNumberOfOnesOptimalApproach {
	public static int lowerBound(int[] arr,int col) {
		int low = 0, high = col-1;
		int ans = col;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] >= 1) {
				ans = mid;
				high = mid -1;
				
			}
			else{
				low = mid +1 ;
			}
		
		}
		return ans;
	}
	public static int rowWithMax1s(int[][] matrix,int row,int col) {
		int cnt_max = 0;
		int index = -1;
		for(int i=0;i<row;i++) {
			int cnt_ones =col - lowerBound(matrix[i],col);
			if(cnt_ones>cnt_max) {
				cnt_max = cnt_ones;
				index = i;
			}
			
		}
		return index;
	}

	public static void main(String[] args) {
		int[][] matrix = {{1, 0, 0}, {1, 0, 1}, {0, 0, 0}};
        int row = 3, col = 3;
        System.out.println("The row with maximum no. of 1's is(indexed): " + rowWithMax1s(matrix, row, col));
	}

}
