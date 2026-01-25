/*
 * time complexity : O(2*(N*M))
 * space complexity : O(N) +O(M)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroBetterApproach {
	
	public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix,int rows,int cols){
		int[] rowArray = new int[rows];
		int[] colArray = new int[cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(matrix.get(i).get(j)==0) {
					rowArray[i]=1;
					colArray[j]=1;
				}
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if (rowArray[i]==1 || colArray[j]==1) {
					matrix.get(i).set(j, 0);					
				}
			}
		}
		return matrix;
	}
	
	
	public static void main(String[] args ) {
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


