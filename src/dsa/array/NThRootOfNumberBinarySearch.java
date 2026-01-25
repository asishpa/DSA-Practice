/*
 * Time complexity: O(log N)
 * Space complexity: O(1)
 */
package dsa.array;

public class NThRootOfNumberBinarySearch {
	public static int func(int mid,int n,int m) {
		long ans =1;
		for(int i=0;i<n;i++) {
			ans = ans*mid;
			
		}
		
		if(ans==m)
			return 1;
		else if(ans<m)
			return 0;
		else
			return 2;
	}
	public static int NthRoot(int n,int m) {
		int low = 1;
		int high = m;
		while(low<high) {
			int mid = (low+high)/2;
			int ans = func(mid, n,m);
			
			if(ans==1)
				return mid;
			else if(ans==2)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int n = 3, m = 125;
	     int ans = NthRoot(n, m);
	     System.out.println("The answer is: " + ans);

	}

}
