/*
 * Time Complexity:  O(n^2 * 26) ≈ O(n^2) because 26 is constant.
 * Space Complexity: O(1)
 */
package dsa.string;

import java.util.HashMap;
import java.util.Map;

public class SumOfBeautyOfAllSubstring {
	
	public static int beautySum(String s) {
		int sum =0;
		
		for(int i=0;i<s.length();i++) {
			Map<Character, Integer> freq = new HashMap<>();
			for(int j=i;j<s.length();j++) {
				freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0)+1);
				int min = Integer.MAX_VALUE;
				int max = Integer.MIN_VALUE;
				for(int val: freq.values()) {
					min = Math.min(min, val);
					max = Math.max(max, val);
				}
				sum += (max - min);
				
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String s = "xyx";
		System.out.println("Beauty Sum:"+beautySum(s));

	}

}
