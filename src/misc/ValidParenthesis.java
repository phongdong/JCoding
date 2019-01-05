package misc;

import java.util.Stack;

public class ValidParenthesis {
	
	public static boolean isValidParenthesis(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (Character c: str.toCharArray()) {
			if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (c== '(')
				stack.push(')');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}
	public static int countInvalidParenthesis(String str) {
		Stack<Character> stack = new Stack<>();
		int count = 0;
		for (Character c: str.toCharArray()) {
			if (c=='(') 
				stack.push(')');
			else if (stack.isEmpty()) {
				count++;
			} else if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		return stack.size() + count;
	}
	public static void main(String args[]) {
//		String str = "{([[]])}";
//		System.out.println(isValidParenthesis(str));
		
		String str = "(()()";
		//String str = ")(";
		System.out.println(countInvalidParenthesis(str));
	}
}
