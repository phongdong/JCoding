
/*abstract


reverseVowels(word) - Given an array of characters, 
reverse the vowels but keep the consonants in place.

Space complexity: O(1)
Time complexity: O(N)
Example: ["w","h","i","t","e","b","o","a","r","d"] -> 
        ["w","h","a","t","o","b","e","i","r","d"]

*/// package whatever; // don't place package name!

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;


/**
 * @author pdong
 *
 */
class Demo1 {
	public static void main(String[] args) {
		
		
		//int[] a = {-1, -4, 2, 3, 4, 1, 5};
		//match(a);

		//char[] input = { 'w', 'h', 'i', 't', 'e', 'b', 'o', 'a', 'r', 'd' };

		//System.out.println(reverse(input, 0, input.length-1));

		//System.out.println(Arrays.toString(reverse(input, 0, input.length - 1)));
		//		System.out.println(getFirst(input, 0, input.length - 1));
		//		System.out.println(getLast(input, 0, input.length - 1));
		
		/*
		countPalindrome("abba");
		countPalindrome("abcdcaa");
		countPalindrome("aaabbb");
		*/
		
		/*
		bracket_match("(()())");
		bracket_match("((())");
		bracket_match("())");
		bracket_match(")(");
		*/
		
		/*
		four_letter_words("This sentence is íne");
		four_letter_words("So is this one");
		four_letter_words("Hello");
		*/
		/*
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "coding";
		String word2 = "practice";
		shortestDistance(words, word1, word2);
		*/
		 String str1 = "sunday";
		 String str2 = "saturday";
		 System.out.println(editDistance(str1, str2, str1.length(), str2.length()));

	}
	
	static int min(int x, int y, int z) {
		int min = x < y ? x : y;
		min = min < z ? min : z;
		return min;
	}
	
	public static int editDistance(String first, String second, int m, int n) {
		if (m == 0)
			return n;
		
		if (n == 0)
			return m;
		
		if (first.charAt(m-1) == second.charAt(n-1))
			return editDistance(first, second, m-1, n-1);
		
		return 1 + min(editDistance(first, second, m, n-1), 
					   editDistance(first, second, m-1, n), 
					   editDistance(first, second, m-1, n-1));
	}
	
	public static void shortestDistance(String[] words, String word1, String word2) {
		int first = -1;
		int second = -1;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			if (word1.equals(s)) 
			{
				first = i;
				if (second != -1) {
					min = Math.min(min, first - second);
				}
			}
			else if (word2.equals(s)) 
			{
				second = i;
				if (first != -1) {
					min = Math.min(min, second - first);
				}
			}
		}
		
		System.out.println(min);
	}
	
	public static void ascii_deletion_distance(String str1, String str2) {
	}
	
	static void four_letter_words(String sentence) {
		String[] sentenceArray = sentence.split(" ");
		int count = 0;
		
		for (int i = 0; i < sentenceArray.length; i++) {
			if (sentenceArray[i].length() == 4) {
				count ++;
			}
		}
		System.out.println(count);
	}
	
	static void bracket_match(String brackets) {
		char[] chars = brackets.toCharArray();
		Stack<Character> stack = new Stack<>();
		int count = 0;
		
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(') 
				stack.push(')');
			else {
				if (stack.isEmpty()) {
					count++;
				} else {
					if (chars[i] != stack.pop()) {
						count++;
					}
				}
			}
		}
		System.out.println(stack.size() + count);
	}
	
	static void countPalindrome(String str) {
		StringBuilder s = new StringBuilder(str);
		StringBuilder newStr = s.reverse();
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			//System.out.println(str.charAt(i) + ": " + newStr.charAt(i));
			if (str.charAt(i) != newStr.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	public static int countOnes(int arr[],int end,int start){
	
	    if(end>=start){
	        int mid=start+(end-start)/2;
	      
	        if((mid==end || arr[mid+1]==0) && arr[mid] == 1){
	          return mid+1;
	        }
	        if(arr[mid]==1){
	          return countOnes(arr,(mid+1),end);
	        }
	      
	         return countOnes(arr,start,(mid-1));
	    
	    }
	    return 0;
	  } 

	
	public static void match(int a[]){
		  
	    for(int i=0;i<a.length;i++){
	      
	          for (int j=0;j<a.length;j++){
	            
	              if(a[j]<0 && a[i]== Math.abs(a[j])){
	                
	                System.out.println(Math.abs(a[j]));
	              }
	          }     
	    }
	    return;
	  }
	static void matching(int[] a) {
		HashSet<Integer> hs = new HashSet();
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] + a[j] == 0 && i != j) {
					hs.add(Math.abs(a[i]));
				}
			}
		}

		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	
	static char[] reverse(char[] input, int l, int r) {
		int i = getFirst(input, 0, input.length - 1);
		int j = getLast(input, 0, input.length - 1);

		while (i < j) {
			char tmp = input[i];
			input[i] = input[j];
			input[j] = tmp;
			i++;
			j--;
		}

		return input;
	}

	static int getFirst(char[] input, int l, int r) {
		int i = -1;

		while (l < r) {
			if (input[l] == 'i' || input[l] == 'e' || input[l] == 'a' || input[l] == 'u' || input[l] == 'o') {
				i = l;
				break;
			}
			l++;
		}
		return i;
	}

	static int getLast(char[] input, int l, int r) {
		int i = -1;

		while (l < r) {
			if (input[r] == 'i' || input[r] == 'e' || input[r] == 'a' || input[r] == 'u' || input[r] == 'o') {
				i = r;
				break;
			}
			r--;
		}
		return i;
	}
	
	

	

	
}
