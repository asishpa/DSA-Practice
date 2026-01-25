/*
 * Time Complexity:O(n X m), where n = given row number, m = given column number. We are using nested loops running for n and m times respectively.
 * Space Complexity: O(1)
 */
package dsa.array;

public class RowWithMaximumNumberOfOnesBruteForce {
	public static int rowWithMax1s(int[][] matrix,int row,int col) {
		int cnt_max = 0;
		int index = -1;
		for(int i=0;i<row;i++) {
			int count=0;
			for(int j=0;j<col;j++) {
				if(matrix[i][j]==1)
					count++;
			}
			if(count>cnt_max) {
				cnt_max = count;
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
