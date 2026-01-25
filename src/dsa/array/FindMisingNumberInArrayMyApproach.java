//works only for sorted arrays 
package dsa.array;

public class FindMisingNumberInArrayMyApproach {
	public static int findMissingNumber(int arr[],int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]!=i+1) {
				
				return i+1;
				
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,4,5};
		int n=5;
		int result =findMissingNumber(arr, n);
		System.out.println("The missing no. is "+result);
		 
		
	}

}
