/*
 * Time Complexity: O(N),We traverse the string once to collect words (O(N)) and once more to reverse and join them (O(N)). Hence total time is O(N).
 * Space Complexity: O(N),We store all words in a separate list/array, requiring extra space proportional to the number of characters.
 */
package dsa.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevereseWordsInAStringBruteForceApproach {
	public static String reverseWords(String s) {
		List<String> words = new ArrayList<>();
		StringBuilder word = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				word.append(s.charAt(i));
			}
			else if(word.length()>0) {
				words.add(word.toString());
				word.setLength(0);
			}
			
		}
		if(word.length()>0) {
			words.add(word.toString());
		}
		Collections.reverse(words);
		return String.join(" ", words);
	}

	public static void main(String[] args) {
		String s = " amazing coding skills ";
        System.out.println(reverseWords(s));

	}

}
