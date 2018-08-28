package com.practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {
	public static void main(String[] args) {
		int[] a = {-1, -4, 2, 3, 4, 1, 5};
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			int complete = 0 - a[i];
			if (hm.containsKey(complete))
				System.out.println(a[i]);
			
			hm.put(a[i], i);
		}
		
		String[] input = { "w", "h", "i", "t", "e", "b", "o", "a", "r", "d" };
		String pstring = "[ieoau]";
		Pattern pattern = Pattern.compile(pstring);

		
		int l = 0;
		int r = input.length - 1;
		int i = -1;
		int j = -1;
		while (l < r) {
			Matcher matcher = pattern.matcher(input[l]);
			if (matcher.find()) {
				i = l;
				break;
			} 
			l++;
		}
		
		while (l < r) {
			Matcher matcher = pattern.matcher(input[r]);
			if (matcher.find()) {
				j = r;
				break;
			} 
			r--;
		}
		
		while (i <= j) {
			String tmp = input[j];
			input[j] = input[i];
			input[i] = tmp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(input));
		
	}
	public static void match(int[] input) {
		
	}
}
