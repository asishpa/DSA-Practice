package dsa.array;

public class FindTheNumberAppearsOnce {
	public static int findTheNumber(int arr[]) {
		int n = arr.length;
		int count =0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count!=2) {
				return arr[i];
			}
			count =0;  
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,1,2,3,3,4,4};
		int result = findTheNumber(arr);
		System.out.println("The no. that appears once is "+result);

	}

}
