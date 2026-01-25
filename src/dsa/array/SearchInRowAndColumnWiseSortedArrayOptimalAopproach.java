/*
 * Time Complexity: O(N+M), where N = given row number, M = given column number. We are starting traversal from (0, M-1), and at most, we can end up being in the cell (M-1, 0). So, the total distance can be at most (N+M). So, the time complexity is O(N+M).
 * Space Complexity: O(1)
 */
package dsa.array;

public class SearchInRowAndColumnWiseSortedArrayOptimalAopproach {
	
	public static boolean searchElement(int[][] matrix,int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int row = 0;
		int col = cols-1;
		while(row<rows && col>=0) {
			if(matrix[row][col]==target)
				return true;
			else if(matrix[row][col] > target)
				col--;
			else
				row++;
			
		}
		return false;
	}
	public static void main(String args[]) {
		 int[][] matrix = {
		            {1, 4, 7, 11, 15},
		            {2, 5, 8, 12, 19},
		            {3, 6, 9, 16, 22},
		            {10, 13, 14, 17, 24},
		            {18, 21, 23, 26, 30}
		  };
		 boolean found = searchElement(matrix,26);
		 if(found)
			 System.out.println("The element exists");
		 else
			 System.out.println("The element does not exist");
	}
}
