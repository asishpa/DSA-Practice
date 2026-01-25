/*
 * 
 */
/*
 * Time Complexity: O(c),
 * Space Complexity: O(1)
 */
package dsa.array;

public class PascalTriangleVariantOne {
	static int nCr(int n,int r) {
		int res=1;
		for(int i=0;i<r;i++) {
			res = res*(n-i);
			res= res/(i+1);
			
		}
		return res;
	}
	static int pascalTriangle(int r,int c) {
		int element = nCr(r-1, c-1);
		return element;
	}

	public static void main(String[] args) {
		int r=5;
		int c=3;
		int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);

	}

}
