/*
 * Time Complexity: O(N*N) + O(N*N)
 * Space Complexity: O(1).
 */
package dsa.array;

public class RotateMatrixOptimalApproach {
	
	public static int[][] rotateMatrix(int[][] matrix){
		int n = matrix.length;
		//transpose of matrix 
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp =0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		/*
		 * System.out.println("transposed Image"); for (int i = 0; i < matrix.length;
		 * i++) { for (int j = 0; j < matrix.length; j++) {
		 * System.out.print(matrix[i][j] + " "); } System.out.println(); }
		 */
		//then reverse the array 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int temp =0;
				temp = matrix[i][j];
				matrix[i][j]= matrix[i][n-j-1];
				matrix[i][n-j-1] = temp;
			}
		}
		return matrix;
		
	}
	
	public static void main(String args[]) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int rotated[][] = rotateMatrix(matrix);
		System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
		
	}

}
