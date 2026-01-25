package dsa.basic;

import java.util.Scanner;

public class PallindromeOfANumber {
	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter a number whose digits are to be reversed ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int eneteredNum = num;
		int reversed=0;
		while(num!=0) {
			int digit = num % 10;
			reversed = reversed* 10 + digit;
			num = num /10;
		}
		System.out.println("The reversed no. is "+reversed);
		if(eneteredNum == reversed) {
			System.out.println("The no. is a pallindrome");
		}
		else {
			System.out.println("The no. is not a pallindrome");
		}
	}

}
