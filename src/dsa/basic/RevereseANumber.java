package dsa.basic;

import java.util.Scanner;

public class RevereseANumber {
	
	public static void main(String args[]) {
		int num;
		System.out.println("Enter a number whose digits are to be reversed ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int reversed=0;
		while(num!=0) {
			int digit = num % 10;
			reversed = reversed* 10 + digit;
			num = num /10;
		}
		System.out.println("The reversed no. is "+reversed);
		
		
		
	}

}
