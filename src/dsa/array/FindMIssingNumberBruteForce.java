package dsa.array;

public class FindMIssingNumberBruteForce {
	public static int findMissingNumber(int arr[],int n) {
		
		for(int i=1;i<=n;i++) {
			int flag =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String args[]) {
		int arr[] = {1,2,4,5};
		int n=5;
		int result =findMissingNumber(arr, 5	);
		System.out.println("The missing no. is "+result);
	}

}
