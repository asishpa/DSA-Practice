package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RearrangeArrayElementsbySignOptimalApproach {
	
	public static ArrayList<Integer> arrange(ArrayList<Integer> arr) {
		int n = arr.size();
		ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
		int posNoPosition =0;
		int negNoPosition = 1;
		
		for(int i =0;i<n;i++) {
			if(arr.get(i)>0) {
				
				ans.set(posNoPosition, arr.get(i));
				posNoPosition+=2;
				
			}
			else {
				ans.set(negNoPosition, arr.get(i));
				negNoPosition+=2;
				
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,-2,-4,5));
		ArrayList<Integer> ans = arrange(arr);
		
		for(int no: ans) {
			System.out.println(" "+no);
		}
	}

}
