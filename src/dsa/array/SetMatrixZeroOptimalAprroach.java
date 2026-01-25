/*
 * 
 * Time Complexity: O(2*(N*M))
 * Space Complexity: O(1)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroOptimalAprroach {
	public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix,int rows,int cols){
		int col0=1;
		for(int i =0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(matrix.get(i).get(j) == 0 ) {
					//first mark the ith row as 0
					matrix.get(i).set(0, 0);
					
					//then mmark the jth column as 0
					if (j!=0) 
						matrix.get(0).set(i, 0);
					
					else 
						col0=0;								
	}
			}
		}
		// Step 2: Mark with 0 from (1,1) to (n-1, m-1):
		for(int i=1;i<rows;i++) {
			for(int j=i;j<cols;j++) {
				if(matrix.get(i).get(j) !=0) {
					if(matrix.get(0).get(j)==0 || matrix.get(i).get(0) == 0) {
						matrix.get(i).set(j, 0);
					}
				}
			}
		}
		if(matrix.get(0).get(0) == 0 ) {
			for(int j=0;j<cols;j++) {
				matrix.get(0).set(j, 0);
			}
	}
		if(col0==0) {
			for(int i=0;i<rows;i++) {
				matrix.get(i).set(0, 0);
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(4,0,4)));
		matrix.add(new ArrayList<>(Arrays.asList(5,1,1)));
		matrix.add(new ArrayList<>(Arrays.asList(8,3,1)));
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
		
		

	}
	}


