/*
 * Time Complexity: O(N * logM), where N is the number of rows in the matrix, M is the number of columns in each row. The complexity arises because binary search is performed on the columns, and for each mid column, a linear search through the rows is executed to find the maximum element.
	Space Complexity: O(1)
 */
package dsa.array;

public class PeakElement2DMatrix {
	public static int findRowWithMaxElement(int[][] mat,int col) {
		int rows = mat.length;
		int max = Integer.MIN_VALUE;
		int index = -1;
		for(int i = 0;i<rows;i++) {
			if(mat[i][col]>max) {
				max = mat[i][col];
				index = i;
			}
			
		}
		return index;
	}
	public static int[] findPeakElement(int[][] mat) {
		int cols = mat[0].length;
		int low = 0;
		int high = cols-1;
		
		while(low<=high) {
			int mid = (low+high) / 2;
			//find row with max element in that column
			int row = findRowWithMaxElement(mat,mid);
			int left = mid-1>=0 ? mat[row][mid-1] : Integer.MIN_VALUE;
			int right = mid+1<cols ? mat[row][mid+1] : Integer.MIN_VALUE;
			if(mat[row][mid]> left && mat[row][mid] > right) {
				return new int[] {row,mid};
			}
			else if(left > mat[row][mid]) {
				high = mid -1;
			}
			else {
				low = mid +1 ;
			}
		}
		
		 return new int[]{-1, -1};
	}

	public static void main(String[] args) {
		int[][] mat = {
	              {4, 2, 5, 1, 4, 5},
	              {2, 9, 3, 2, 3, 2},
	              {1, 7, 6, 0, 1, 3},
	              {3, 6, 2, 3, 7, 2}
	          };
		int[] peak = findPeakElement(mat);
		 System.out.println("The row of the peak element is " + peak[0] +
                 " and the column of the peak element is " + peak[1]);
	}

}
