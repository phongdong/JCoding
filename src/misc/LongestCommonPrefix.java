package misc;// Longest Common Prefix
// {"geeksforgeeks", 
//  "geeks", 
//  "geek", 
//  "geezer"}

public class LongestCommonPrefix {
	public String lcp1(String[] strs) {
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) == -1) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}
	
	public String lcp2(String[] strs) {
		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != c || i == strs[j].length()) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}
}

