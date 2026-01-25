package dsa.array;

public class MaxiumumConsecutiveOneInArray {
	public static int findMaxOnes(int arr[]) {
		int count =0;
		int prevCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;	
			}
			if(arr[i]==0) {
				if(count>prevCount) {
					prevCount = count;
					count=0;
				}

			}
		}
		return Math.max(count, prevCount);

	}
	public static void main (String args[]) {
		int arr[] = {1,0,1,1,1,0,1};
		int result = findMaxOnes(arr);
		System.out.println("The no. of maximum  consceutive 1's is "+result);
		
	}

}
