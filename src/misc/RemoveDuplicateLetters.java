package misc;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveDuplicateLetters {
	public static String removeDuplicateLetters(String s) {
		ArrayList<Object> aList = new ArrayList<Object>();
		aList.add(s.charAt(0));
		int currentIndex = 0;
		for (int i = 1; i < s.length(); i++) {
			if ((char) aList.get(0) > (char) s.charAt(i)) {
				
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (!aList.contains(s.charAt(i))) {
				aList.add(s.charAt(i));
			}
		}
		
		ListIterator<Object> listIterator = aList.listIterator();
		String resultString = "";
		while (listIterator.hasNext()) {
			resultString += listIterator.next();
		}
		
		return resultString;
	}
}
