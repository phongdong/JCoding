package com.java8practice;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice8 {

	public static void main(String[] args) {
		/*
		List<String> names1 = new ArrayList<String>();
		names1.add("Mahesh ");
		names1.add("Suresh ");
		names1.add("Ramesh ");
		names1.add("Naresh ");
		names1.add("Kalpesh ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Mahesh ");
		names2.add("Suresh ");
		names2.add("Ramesh ");
		names2.add("Naresh ");
		names2.add("Kalpesh ");

		System.out.println("misc.Sort using Java 7 syntax: ");

		sortName7(names1);
		System.out.println(names1);
		System.out.println("misc.Sort using Java 8 syntax: ");
		

		sortName8(names2);
		System.out.println(names2);
		*/
		System.out.println("testing");
		
		Practice8 tester = new Practice8();

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

	
	public static void sortName7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}

	public static void sortName8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}
