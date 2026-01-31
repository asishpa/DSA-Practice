/*
 * Time Complexity: O(n), since we are performing a single traversal of the string.
 * Space Complexity: O(1)  since we are using a few variables to track the current state.
 */
package dsa.string;

public class RemoveOuterParanthesis {
	public static String removeOuterParentheses(String s) {
		StringBuilder result = new StringBuilder();
		int level =0;
		for(char ch: s.toCharArray()) {
			if(ch=='(') {
				if(level>0)
					result.append(ch);
				level++;
			}
			if(ch==')') {
				level--;
				if(level>0)
					result.append(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String s = "(()())(())";
		String ans = removeOuterParentheses(s);
	    System.out.println("The result is: " + ans);


	}

}
