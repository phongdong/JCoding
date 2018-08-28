package com.practice.programcreek;

class Reentran {
	public synchronized void m() {
		n();
		System.out.println("this is method m()");
	}
	public synchronized void n() {
		System.out.println("this is method n()");
	}
}


public class ReentranTest {
	
//	Reentran re = new Reentran();
//	
//	Thread thread = new Thread() {
//		public void run() {
//			re.m();
//		}
//	};
	
}
