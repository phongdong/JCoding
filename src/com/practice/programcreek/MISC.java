package com.practice.programcreek;

import java.util.EnumSet;


enum days {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class MISC {

	public static void main(String[] args) {
		EnumSet<days> set = EnumSet.allOf(days.class);
		
		System.out.println(set);
	}

}
