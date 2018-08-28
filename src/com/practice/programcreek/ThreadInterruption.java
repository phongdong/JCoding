package com.practice.programcreek;

class InterruptingThread extends Thread {
	public void run() {
//		try {
//			Thread.sleep(1000);
//			System.out.println("task");
//		} catch (InterruptedException e) {
//			System.out.println("exception handled " + e);
//		}
//		System.out.println("thread is running");
		
		
		for (int i=1;i<=5;i++)  {
			if (Thread.interrupted()) {
				System.out.println("code for interrupted thread");
			} else {
				System.out.println("code for non interrupting thread");
			}
		}
			 
			  
		
	}
}

public class ThreadInterruption {

	public static void main(String[] args) {
		InterruptingThread thread1 = new InterruptingThread();
		InterruptingThread thread2 = new InterruptingThread();
		
		thread1.start();
		thread1.interrupt();
		thread2.start();

	}

}
