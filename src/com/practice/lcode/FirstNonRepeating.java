package com.practice.lcode;


import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map.Entry;


public class FirstNonRepeating {
	public static void firstNonRepeating(String str) {
		TreeMap<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			} else {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1 );
			}
		}
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
			
		}
	}
	
	public static void firstNonRepeating2(String str) {
		char[] count = new char[256];
		int index = -1, i;
		for ( i = 0; i < str.length(); i++) {
			count[str.charAt(i)] ++;
		}
		
		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		System.out.println(str.charAt(index));
	}
	
	public static void firstNonRepeating3(String str) {
		HashMap<Character, CountIndex> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), new CountIndex(i));
			} else {
				hm.get(str.charAt(i)).incCount();
			}
		}
		
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < str.length(); i++) {
			if (hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index)
			{
				result = hm.get(str.charAt(i)).index;
			}
		}
		System.out.println(str.charAt(result));
		
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		firstNonRepeating3(str);

	}
}

class CountIndex {
	public int index;
	public int count;
	CountIndex(int index) {
		this.index = index;
		this.count = 1;
	}
	void incCount() {
		count++;
	}
}
