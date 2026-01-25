package dsa.array;

public class MoveZeroesWithoutTempArray {
	public static void removeZeroes(int arr[], int n) {
		
		int j=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		for(int i=j+1;i<n;i++ ) {
			if(arr[i]!=0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
				
			}
		}
		
		
		
	}

	public static void main(String args[]) {
		int arr[] = {1,0,4,5,0,7};
		int n = arr.length;
		removeZeroes(arr,n);
		System.out.println("After moving the zeroes to right ");
	    for (int i = 0; i < n; i++) {
	      System.out.print(arr[i] + " ");
	    }
		
	}
}
