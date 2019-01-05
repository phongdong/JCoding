package misc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class IsPalindrome {
	static Stack<Character> stack = new Stack<Character>();
	static Queue<Character> queue = new LinkedList<>();

	public static void main(String[] args) {
		String str = "racecar1";
		String isPalindrome = isPalindrome(str) == true ? "is" : "is not";
		System.out.println("The word, " + str + ", " + isPalindrome + " a palindrome.");
	}
	
	public static void pushCharacter(char ch) {
		stack.push(ch);
	}
	
	public static char popCharacter() {
		return stack.pop();
	}
	
	public static void enqueueCharacter(char ch) {
		queue.add(ch);
	}
	
	public static char dequeueCharacter() {
		return queue.remove();
	}
	
	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			pushCharacter(str.charAt(i));
			enqueueCharacter(str.charAt(i));
			if(popCharacter() != dequeueCharacter())
				return false;
		}
		
		return true;
	}

}
