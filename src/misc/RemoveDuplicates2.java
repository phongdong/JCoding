package misc;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class RemoveDuplicates2 
{
	public static String removeDuplicates1(String s) {
		String rel = "";
		ArrayList<Object> aList = new ArrayList<Object>();
		for (int i = 0; i < s.length(); i++) {
			if (!aList.contains(s.charAt(i))) {
				aList.add(s.charAt(i));
			}
		}
		
		ListIterator<Object> listIter = aList.listIterator();
		while(listIter.hasNext()) {
			rel += listIter.next();
		}
		
		return rel;
	}
	
	public static String removeDuplicates2(String s) {
		String rel = "";
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			lhs.add(s.charAt(i));
		}
		for (Character c: lhs) {
			rel += c;
		}
		
		return rel;
	}
}
