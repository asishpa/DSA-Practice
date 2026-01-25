package dsa.array;

public class FindMissingNumberUsingHashing {
	
	public static int findMissingNumber(int arr[],int n) {
		int[] hash = new int[n+1];
		for(int i=0;i<arr.length;i++) {
			hash[arr[i]]++;
		}
		for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
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
