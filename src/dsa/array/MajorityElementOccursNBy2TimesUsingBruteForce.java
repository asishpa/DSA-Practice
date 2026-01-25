package dsa.array;

public class MajorityElementOccursNBy2TimesUsingBruteForce {
	
	public static int findElement(int arr[]) {
		   int n = arr.length;
		   int N = n/2;//3/2=1
		   for(int i=0;i<n;i++) {
			   int count =0;
			   for(int j=0;j<n;j++) {
				   if(arr[j]==arr[i])
					   count++;
			   }
			   if(count>N) {
				   return arr[i];
			   }
		   }
		   return -1;
		   
		   
	}
	public static void main(String args[]) {
		int[] arr = {3,2,3};
		int element = findElement(arr);
		System.out.println("The element is "+element);
	}

}
