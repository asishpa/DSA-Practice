/*
 * Time Complexity: O((N*M)*(N + M)) + O(N*M),
 * Space Complexity: O(1)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroBruteForce {
	public static void markRow(ArrayList<ArrayList<Integer>> matrix,int rows,int cols,int rowNo) {
		for(int i=0;i<cols;i++) {
			if(matrix.get(rowNo).get(i) != 0) {
				matrix.get(rowNo).set(i, -1);			
			}
			
		}
		
	}
	public static void markColumn(ArrayList<ArrayList<Integer>> matrix,int rows,int cols,int colNo) {
		for(int i=0;i<rows;i++) {
			if(matrix.get(i).get(colNo) != 0) {
				matrix.get(i).set(colNo, -1);
				
			}
			
		}
		
	}
	public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix,int rows ,int cols ){
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(matrix.get(i).get(j)==0){
					markRow(matrix, rows, cols, i);
					markColumn(matrix, rows, cols, j);
					
				}
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(matrix.get(i).get(j) ==-1) {
					matrix.get(i).set(j, 0);
				}
			}
		}
		return matrix;
	}
	

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
		matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(0,1,1)));
		int rows = matrix.size();
		int cols = matrix.get(0).size();
		
		ArrayList<ArrayList<Integer>> resultMatrix= zeroMatrix(matrix, rows, cols);
		System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : resultMatrix) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
		
		// TODO Auto-generated method stub

	}

}
