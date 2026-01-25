package dsa.array;

public class RotateArrayWithoutTempArray {
	
public static void rotateRight(int arr[], int start,int end ) {
		
	int temp;
	while(start < end) {
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		start++;
		end--;
	}

		
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		int k =  2;
		rotateRight(arr, 0, n-k-1);//0,4
		rotateRight(arr, n-k, n-1);
		rotateRight(arr, 0, n-1);
		System.out.println("After Rotating the elements to right ");
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
		
		
	}

}
