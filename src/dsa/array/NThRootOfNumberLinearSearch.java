/*
 * Time complexity: O(N) where N is the given number
 * Space Complexity: O(1) 
 */
package dsa.array;

public class NThRootOfNumberLinearSearch {
	public static long func(int base,int expo) {
		long ans =1;
		while(expo>0) {
			if(expo%2==1) {
				expo--;
				ans = ans *base;
			}
			else {
				expo /=2;
				base = base*base;
			}
		}
		return ans;
	}
	public static int NthRoot(int n,int m) {
		for(int i=1;i<m;i++) {
			long ans = func(i, n);
			if(ans == m) {
				return i;
			}
			if(ans>m)
				break;
		}
		return -1;
	}
	public static void main(String[] args) {
		 int n = 3, m = 27;
	     int ans = NthRoot(n, m);
	     System.out.println("The answer is: " + ans);
	}

}
