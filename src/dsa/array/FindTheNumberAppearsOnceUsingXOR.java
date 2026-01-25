package dsa.array;

public class FindTheNumberAppearsOnceUsingXOR {
	public static int findTheNumber(int arr[]) {
		int n = arr.length;
		int xorr =0;
		for(int i=0;i<n;i++) {
			xorr = xorr ^ arr[i];
		}
		return xorr;
	}
	public static void main(String args[]) {
		int arr[] = {1,1,2,3,3,4,4};
		int result = findTheNumber(arr);
		System.out.println("The no. that appears once is "+result);
		
	}

}
