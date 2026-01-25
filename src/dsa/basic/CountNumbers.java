package dsa.basic;

import java.util.Scanner;

public class CountNumbers {
	public static void main(String args[]) {
		
		int num;
		int count = 0;
		System.out.println("Enter a number whose digits are to be counted ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num == 0) {
			count = count+1;
			
		}
		while(num!=0) {
			count++;
			num = num/10;
		}
		System.out.println("The no. of digits are :"+count);
	}
	
	

}
