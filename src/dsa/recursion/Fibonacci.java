package dsa.recursion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		no = sc.nextInt();
		int result = fib(no);
		System.out.println(result);
		
	}
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}

}
