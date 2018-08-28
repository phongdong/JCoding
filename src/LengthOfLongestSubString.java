import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class LengthOfLongestSubString {
	
	public static int lengthOfLongestSubString(String s) {
		int max = 0;
		HashMap<Character, Integer> hs = new HashMap<>();
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (hs.containsKey(s.charAt(i))) {
				j = Math.max(j, hs.get(s.charAt(i)) + 1);
			}
			hs.put(s.charAt(i), i);
			max = Math.max(max, i - j + 1);
		}
		
		return max;
	}
	
	public static void longestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<String, Integer> substr = new HashMap<>();
		int i = 0;
		int j = 0;
		for ( i = 0; i < s.length()-1; i++) {
			j = i;
			while (j < s.length() && !map.containsKey(s.charAt(j))) {
				map.put(s.charAt(j), j);
				j++;
			}
			substr.put(s.substring(i, j), s.substring(i, j).length());
			map.clear();
		}
		for (Entry<String, Integer> entry: substr.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
	
	
	public static void getLongestSubString(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		HashMap<String, Integer> submap = new HashMap<>();
		int i = 0;
		int j = 0;
		for (i = 0; i < s.length()-1; i++) {
			j = i;
			while (j < s.length() && !hm.containsKey(s.charAt(j))) {
				hm.put(s.charAt(j), j);
				j++;
			}
			submap.put(s.substring(i, j), s.substring(i, j).length());
			hm.clear();
		}
		
		for (Entry<String, Integer> entry: submap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		//getLongestSubString("abcabcbb");
		//getLongestSubString("bbbbb");
		longestSubstring("pwwkew");

	}

}
