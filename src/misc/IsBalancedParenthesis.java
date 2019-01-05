package misc;

import java.util.Stack;

public class IsBalancedParenthesis {
	public static boolean isBalancedParenthesis(String str) {
		Stack<Character> stack = new Stack<>();
		for (Character c: str.toCharArray()) {
			if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (c == '(')
				stack.push(')');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = "{([[]]])}";
		System.out.println(isBalancedParenthesis(str));
	}

}
