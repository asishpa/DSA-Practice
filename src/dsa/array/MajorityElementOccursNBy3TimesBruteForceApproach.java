/*
 * Time Complexity: O(N2),
 * Space Complexity: O(1)
 */
package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementOccursNBy3TimesBruteForceApproach {
	static List<Integer> findMajorityElement(int[] arr){
		int n = arr.length;
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(ans.size()==0 || ans.get(0)!=arr[i]) {
			
				int count=0;
				for(int j=0;j<n;j++) {
					if(arr[i]==arr[j]) {
						count++;
						
					}
				}
				if(count>n/3) {
					
					ans.add(arr[i]);
				}
				if(ans.size()==2)
					break;
			}
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		int[] arr = {11, 33, 33, 11, 33, 11};
		List<Integer> ans =  findMajorityElement(arr);
		System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + ",");
        }
        System.out.println();
		
		
	}

}
