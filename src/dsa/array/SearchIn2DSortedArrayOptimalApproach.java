/*
 * Time Complexity: O(log(NxM)), where N = given row number, M = given column number.We are applying binary search on the imaginary 1D array of size NxM.
 * Space Complexity: O(1) as we are not using any extra space.
 */
package dsa.array;

public class SearchIn2DSortedArrayOptimalApproach {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int low = 0;
		int high = (rows * cols) -1 ; 
		while(low <= high) {
			int mid = (low+high) / 2;
			//convert 1d array to 2d array coordinates 
			int row = (mid/cols);
			int col = (mid%cols);
			if(matrix[row][col] == target) {
				return true;
			}
			else if(matrix[row][cols]> target) {
				high = mid -1 ;
			}
			else{
				low = mid +1 ;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };
	 if(searchMatrix(matrix,1))
		 System.out.println("The element exists  ");
	 else
		 System.out.println("The element does not exist");
	}

}
