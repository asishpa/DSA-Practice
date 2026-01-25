package dsa.array;

public class FindMissingNumberUsingSum {
	public static int findMissingNumber(int arr[],int n) {
		int sumOfArray=0;
		for (int i=0;i<arr.length;i++) {
			sumOfArray +=arr[i];
		}
		int expectedSum = (n*(n+1))/2;
		int missingNum = expectedSum - sumOfArray;
		return missingNum;
	}
	public static void main(String args[]) {
		int arr[] = {1,2,4,5};
		int n=5;
		int result =findMissingNumber(arr, 5	);
		System.out.println("The missing no. is "+result);
	}


}
