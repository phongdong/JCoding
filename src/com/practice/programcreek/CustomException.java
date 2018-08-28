package com.practice.programcreek;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class CustomException {
	
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("invalid age");
		} else {
			System.out.println("welcome to vote");
		}
	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			System.out.println("Exception occured: " + e);
		}
		System.out.println("rest of the code");
	}

}
