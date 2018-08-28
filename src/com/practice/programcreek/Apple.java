package com.practice.programcreek;

import java.util.HashMap;
import java.util.Map.Entry;

public class Apple {
	private String color;
	public Apple(String color) {
		this.color = color;
	}
	public boolean equals(Object obj) {
		if (obj == null) 
			return false;
		if (!(obj instanceof Apple)) 
			return false;
		if (obj == this) 
			return true;
		return this.color.equals(((Apple)obj).color);
	}
	
//	public int hasCode() {
//		return this.color.hashCode();
//	}

	public static void main(String[] args) {
		Apple a1 = new Apple("green");
		Apple a2 = new Apple("white");
		
		HashMap<Integer, Apple> map = new HashMap<>();
		map.put(1, a1);
		map.put(2, a2);
		Apple a3 = new Apple("green");
		map.put(3, a3);
		System.out.println(map.get(3).equals(map.get(1)));

	}

}
