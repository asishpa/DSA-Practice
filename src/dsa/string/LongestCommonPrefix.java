package dsa.string;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] input) {
		StringBuilder ans = new StringBuilder();
		Arrays.sort(input);
		String first = input[0];
		String last = input[input.length-1];
		for(int i=0;i<Math.min(first.length(), last.length());i++) {
			if(first.charAt(i)!=last.charAt(i)) {
				return ans.toString();
			}
			ans.append(first.charAt(i));
		}
		return ans.toString();
	}
	public static void main(String[] args) {
        String[] input = {"interview", "internet", "internal", "interval"};
        System.out.println("The longest common prefix is:"+longestCommonPrefix(input)); 
	}

}
