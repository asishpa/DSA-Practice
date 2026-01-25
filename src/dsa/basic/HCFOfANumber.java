package dsa.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HCFOfANumber {
	public static void main(String[] args) {
	
		int no1;
		int no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no.");
		no1 = sc.nextInt();
		
		System.out.println("Enter the second no. ");
		no2 = sc.nextInt();
		List<Integer> factorsOfFirstNo = getFactorsOfANumber(no1);
		List<Integer> factorsOfSecondNo = getFactorsOfANumber(no2);
		List<Integer> common = factorsOfFirstNo.stream()
				.filter(factorsOfSecondNo::contains)
				.toList();
		int hcf = common.isEmpty()?1:Collections.max(common);
		System.out.println("The hcf of two nos is "+hcf);
		
	
	}
	public static List<Integer> getFactorsOfANumber(int no) {
		List<Integer> divisors = new ArrayList<>();
		for(int i = 1;i<=no;i++){
			if(no%i==0) {
				divisors.add(i);
			}
		}
		return divisors;
	}
	

}
