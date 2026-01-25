package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracjerProblem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			System.out.println(isBalanced(s));
		}
	}
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c: s.toCharArray()) {
			if(c=='(' || c== '{' || c == '[') {
				stack.push(c);
			}
			else if (stack.isEmpty() || (c==')' && stack.pop() != '(') || (c==']' && stack.pop()!= '[') || (c=='}' && stack.pop()!='{')) {
				return false;
				
			}
			
		}
		return stack.isEmpty();
	}

}
