package com.practice.lcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class SingleDigitCalculation {
	
	static int NUM_OF_TEST = 5;
	static int num1 = Integer.MIN_VALUE;
	static int num2 = Integer.MIN_VALUE;
	static HashMap<String, Long> times;
	static HashSet<String> setQuestions = new HashSet<>();;
	static long totalTime = 0;
	static int NUM_OF_TOP_ANSWER = 3;

	public static void main(String[] args) {
		generateTwoNumber();
		boolean done = false;
		long startTime;
		long finishedTime;
		long elapsedTime;

		Scanner scanner;
		int userInput;
		int count = 0;
		times = new HashMap<>();
		
		String question;
		
		scanner = new Scanner(System.in);
		
		while (!done && count < NUM_OF_TEST) {
			startTime = System.currentTimeMillis();
			userInput = scanner.nextInt();
			
			if (userInput != num1 + num2 ) {
				do {
					System.out.println("Sorry, your answer is incorrected. Try again? ");
					userInput = scanner.nextInt();
				} while(userInput != num1 + num2 );
			} 
			finishedTime = System.currentTimeMillis();
			elapsedTime = finishedTime - startTime;
			totalTime += elapsedTime;
			question= Integer.toString(num1)  +"+"+Integer.toString(num2)+"="+Integer.toString(userInput);
			times.put(question,elapsedTime);
			
			System.out.println("Nice! You nailed it.\n");
			
			count++;
			if (count == NUM_OF_TEST) {
				done = true;
				break;
			}
			generateTwoNumber();
		}
		
		System.out.println("Awesome, you are done with the test!");
		System.out.println("Total seconds: " + totalTime/1000);
		
		getTopAnswer();
		
		scanner.close();
	}

	public static void getTopAnswer() {
		Set<Entry<String, Long>> set = times.entrySet();

		List<Entry<String, Long>> list = new ArrayList<Entry<String, Long>>(set);

		Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {

			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}

		});
		System.out.println(list.subList(0, NUM_OF_TOP_ANSWER));
	}
	
	public static void generateTwoNumber() {
		Random rand = new Random();
		String questionStr="";
		do {
			num1 = rand.nextInt(9) + 1;
			num2 = rand.nextInt(9) + 1;
			questionStr = Integer.toString(num1) + "+" + Integer.toString(num2);
		} while (setQuestions != null && setQuestions.contains(questionStr));
		
		setQuestions.add(questionStr);
		System.out.println(num1 + " + " + num2 + " ? ");
	}
}
