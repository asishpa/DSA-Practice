package dsa.array;

public class PeakElement2DMatrix {
	public static int findRowWithMaxElement(int[][] mat) {
		
	}
	public static int[] findPeakElement(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;
		int low = 0;
		int high = cols-1;
		int mid = (low+high) / 2;
		
		
		
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
