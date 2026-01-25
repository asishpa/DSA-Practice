package dsa.array;

public class SecondLargestElementInArray {
	static int findSecondLargest(int arr[]) {
		int largest = arr[0];
		int secondLargest = -1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]> largest) {
				secondLargest = largest;
				largest = arr[i];
			}
		}
		return secondLargest;
	}
	public static void main(String args[]) {
		int arr[] = {1,7,3,5,8};
		
		System.out.println(findSecondLargest(arr));
	}

}
