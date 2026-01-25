/*
 * Time complexity : O(r^2) where r is the no. of rows 
 * Space Complexity : O(1)
 */
package dsa.array;

public class PascalTriangleVariantTwo {
	static int nCr(int n,int r) {
		int res=1;
		for(int i=0;i<r;i++) {
			res = res*(n-i);
			res= res/(i+1);			
		}
		return res;
	}	
	public static void main(String args[]) {
		int r=4;
		for(int i=1;i<=r;i++) {
			System.out.print(nCr(r-1, i-1)+" ");			
		}		
	}

}
