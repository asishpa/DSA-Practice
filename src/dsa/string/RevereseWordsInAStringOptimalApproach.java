package dsa.string;

public class RevereseWordsInAStringOptimalApproach {
	public static String reverseWords(String s) {
		int i = s.length() - 1;
		StringBuilder result = new StringBuilder();
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ') {
				i--;
			}
			if(i<0) break;
			int end = i;
			while(i>=0 && s.charAt(i)!=' ') {
				i--;
			}
			String word = s.substring(i+1,end+1);
			if(result.length() > 0) {
				result.append(" ");
			}
			result.append(word);
			
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String s = " amazing coding skills ";
        System.out.println(reverseWords(s));
	}

}
