/*
 * Time Complexity: O(N*logM), 
 * Space Complexity: O(1)
 */
package dsa.array;

public class SearchInRowAndColumnWiseSortedArrayBetterAopproach {
	public static boolean binarySearch(int[] matrix,int target) {
		int cols = matrix.length;
		int low = 0 , high = cols-1;
		
		while(low<=high) {
			int mid = (low+high) / 2;
			if(matrix[mid]==target)
				return true;
			else if(matrix[mid]>target)
				high = mid - 1;
			else
				low = mid + 1 ;
		}
		return false;
	}
	public static boolean searchElement(int[][] matrix,int target) {
		int rows = matrix.length;
		
		for(int i=0;i<rows;i++) {
			boolean found = binarySearch(matrix[i],target);
			if(found)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
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

