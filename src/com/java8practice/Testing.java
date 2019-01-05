package com.java8practice;


public class Testing {
	public static void main (String[] args) {
		System.out.println("testing");
		
		Testing tester = new Testing();

		MathOperation addition = (int a, int b) -> a + b;
		int result = tester.operate(5, 10, addition);
		System.out.println(result);
	}

	interface MathOperation {
		int operation(int a, int b);
	}

    int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
