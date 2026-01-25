/*
 * Time complexity :O(n^3)
 * Space complexity : O(1)
 */

package dsa.array;

public class PascalTriangleVariantThree {
	static int nCr(int n,int r) {
		int res=1;
		for(int i=0;i<r;i++) {
			res = res*(n-i);
			res= res/(i+1);			
		}
		return res;
	}
	public static void main(String args[]) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(nCr(i-1, j-1)+" ");			
			}	
			System.out.println();
		}
	}

}
