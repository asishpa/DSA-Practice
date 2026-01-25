package dsa.recursion;

import java.util.Scanner;

public class StringPallindromeChecker {
	public static boolean checkIfPallindrome(String str,int left,int right) {
		if(left>right) {
			return true;
		}
		if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		return 	checkIfPallindrome(str,left+1,right-1);
	}
	public static void main(String args[]) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string:");
		str = sc.next();
		boolean result = checkIfPallindrome(str,0,str.length()-1);
		if(result) {
			System.out.println("It is a pallindrome");
		}
		else {
			System.out.println("It is not a pallindrome");
		}
	}
	

}
