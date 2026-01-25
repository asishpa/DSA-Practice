package dsa.array;

public class SearchIn2DSortedArrayBetterApproach {
	public static boolean binarySearch(int[] matrix,int x) {
		int n = matrix.length;
		int low = 0;
		int high = n - 1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(matrix[mid] == x) {
				return true;
			}
			else if(matrix[mid]>x) {
				high = mid -1;
			}
			else {
				low = mid + 1;
			}
		}
		return false;
	}
	public static boolean searchMatrix(int[][] matrix,int x) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for(int i=0;i<rows;i++) {
			if(x>=matrix[i][0] && x<=matrix[i][cols-1]) {
				return binarySearch(matrix[i],x);
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
