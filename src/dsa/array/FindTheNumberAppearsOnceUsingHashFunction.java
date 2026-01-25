package dsa.array;

public class FindTheNumberAppearsOnceUsingHashFunction {
	public static int findTheNumber(int arr[]) {
		int n = arr.length;
		int maxElement = arr[0];
		for(int i=0;i<n;i++) {
			maxElement = Math.max(maxElement, arr[i]);
			
		}
		int[] hash = new int[maxElement+1];
		for(int i=0;i<n;i++) {
			hash[arr[i]]++;
		}
		for(int i=0;i<hash.length;i++) {
			if(hash[arr[i]]==1) {
				return arr[i];
			}
		}
		return -1;
		
	}
	
	public static void main(String args[]) {
		int arr[] = {1,1,2,3,3,4,4};
		int result = findTheNumber(arr);
		System.out.println("The no. that appears once is "+result);

	}

}
