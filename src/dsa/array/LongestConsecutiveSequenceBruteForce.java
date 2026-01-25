package dsa.array;

public class LongestConsecutiveSequenceBruteForce {
	public static boolean linearSearch(int[] arr,int element) {
		boolean found = false;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]== element) {
				found = true;
			}
		}
		return found;
	}
	public static int findLongestSubsequence(int[] arr) {
		int n = arr.length;
		int longest = 0;
		for(int i=0;i<n;i++) {
			int count =1;
			while(linearSearch(arr, arr[i]+1)) {
				count+=1;
				i++;
			}
			longest = Math.max(count, longest);
			
			
		}
		return longest;
	}
	
	public static void main(String args[]) {
		int arr[] = {100,200,1,2,3,4,5};
		int length = findLongestSubsequence(arr);
		System.out.println("The length of longest subsequence is "+length);
	}

}
