/*
 * Time Complexity: O(m x n) where mi is rows and n is columsn
 * Space Complexity: O(n) { Extra Space used for storing traversal in the ans array }
 */
package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalOfMatrix {

	
	public static List<Integer> printSpiral(int[][] matrix){
		int cols = matrix[0].length;
		int rows = matrix.length;
		int top,bottom,left,right;
		top=0;
		bottom=rows-1;
		left =0;
		right = cols-1;
		List<Integer> ans = new ArrayList<>();
		while (left<=right && top<=bottom) {
			for(int i=left;i<=right;i++) {
				ans.add(matrix[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				ans.add(matrix[i][right]);
			}
			right--;
			for(int i = right;i>=left;i--) {
				ans.add(matrix[bottom][i]);
			}
			bottom--;
			for(int i = bottom;i>=top;i--) {
				ans.add(matrix[i][left]);
			}
			left++;
			
		}
		return ans;
	}
	public static void main(String[] args) {
		int [][] matrix = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		List<Integer> ans = printSpiral(matrix);
		for(int i : ans) {
			System.out.print(i+" ");
		
		}

	}

}
