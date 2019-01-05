package misc;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class RemoveDuplicates {
	
	public static String removeDuplicates1(String s) {
		ArrayList<Object> alist = new ArrayList<>();
		for (int j = 0; j < s.length(); j++) {
			if (!alist.contains(s.charAt(j))) {
				alist.add(s.charAt(j));
			}
		}
		ListIterator<Object> listIter = alist.listIterator();
		String relStr = "";
		while (listIter.hasNext()) {
			relStr += listIter.next();
		}
		return relStr;
	}
	
	public static String removeDuplicates2(String s) {
		if (s == null || s.isEmpty()) return "";
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int j = 0; j < s.length(); j++) {
			lhs.add(s.charAt(j));
		}
		String relStr = "";
		for (Character c: lhs) {
			relStr += c;
		}
		return relStr;
	}
	
	public static String removeDuplicates3(String s) {
		char[] chars = s.toCharArray();
		int pos = 1;
		
		for (int i = 1; i < s.length(); i++) {
			int j;
			for (j = 0; j < pos; j++) {
				if (chars[i] == chars[j]) {
					break;
				}
			}
			if (j == pos) {
				++pos;
			} else {
				chars[j] = 0;
				++pos;
			}
		}
		return new String(chars);
	}
	
}
