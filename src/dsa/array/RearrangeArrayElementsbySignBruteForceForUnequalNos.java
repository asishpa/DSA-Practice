package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RearrangeArrayElementsbySignBruteForceForUnequalNos {
	public static ArrayList<Integer> arrange(ArrayList<Integer> arr) {
		int n = arr.size(); 
		ArrayList<Integer> posNos = new ArrayList<>();
		ArrayList<Integer> negNos = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
		for(int i =0;i<n;i++) {
			if(arr.get(i)>0)
				posNos.add(arr.get(i));
			else
				negNos.add(arr.get(i));
		}
		if(posNos.size()>negNos.size()) {
			for(int i=0;i<negNos.size();i++) {
				ans.set(2*i, posNos.get(i));
				ans.set(2*i+1, negNos.get(i));
				
			}
			int newIndex = negNos.size()*2;
			for(int i = negNos.size();i<posNos.size();i++) {
				ans.set(newIndex, posNos.get(i));
				newIndex++; 
			}
		}
		else {
			for(int i=0;i<posNos.size();i++) {
				ans.set(2*i, posNos.get(i));
				ans.set(2*i+1, negNos.get(i));
				
			}
			int newIndex = posNos.size()*2;
			for(int i = posNos.size();i<negNos.size();i++) {
				ans.set(newIndex, negNos.get(i));
				newIndex++; 
			}
			
		}
		
		
		return ans;
	}
	public static void main(String args[]) { 
		ArrayList<Integer > arr = new ArrayList<>(Arrays.asList(1,2,-4,-5,3,4 ));
		ArrayList<Integer> ans =  arrange(arr);
		for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
	}
}
