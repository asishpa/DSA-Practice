package dsa.array;

public class RotateArrayUsingTempArray {
	public static void rotateRight(int arr[], int k,int n ) {
		
		int temp[]= new int[k];
		if(n==0 || k==0)
			return;
		k=k%n;//2%7=2
		for(int i=n-k;i<n;i++) {//i=5->6
			temp[i-n+k] = arr[i];//temp[0]->temp[1] 
		}
		for(int i=n-k-1;i>=0;i--) {
			arr[i+k] = arr[i];
		}
		for(int i=0;i<k;i++) {
			arr[i] = temp[i];
		}
		
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		rotateRight(arr, 2,n);
		System.out.println("After Rotating the elements to right ");
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
		
	}
	

}
