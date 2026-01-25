/*
 * Time Complexity: O(N) + O(N)
 * Space Complexity: O(1)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementOccursNBy3TimesOptimalApproach {
	static List<Integer> findMajorityElement(int[] arr){
		List<Integer> ans = new ArrayList<>();
		int n = arr.length;
		int cnt1=0,cnt2=0;
		int el1=Integer.MIN_VALUE;
		int el2=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(cnt1==0 && arr[i]!=el2) {
				el1=arr[i];
				cnt1=1;
			}
			else if(cnt2==0 && arr[i]!=el1) {
				el2 = arr[i];
				cnt2=1;
			}
			else if(el1==arr[i]) {
				cnt1++;
			}
			else if(el2==arr[i]) {
				cnt2++;
			}
			else {
				cnt1--;
				cnt2--;
			}
		
	}
		cnt1=0;
		cnt2=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==el1)
				cnt1++;
			if(arr[i]==el2)
				cnt2++;
		}
		int mini = n/3;
		if(cnt1>mini)
			ans.add(el1);
		if(cnt2>mini)
			ans.add(el2);
		return ans;
	}
	
	public static void main(String args[]) {
		int[] arr = {2, 1, 1, 3, 1, 4, 5, 6};
		List<Integer> ans =  findMajorityElement(arr);
		System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + ",");
        }
        System.out.println();
		
		
	}
	}