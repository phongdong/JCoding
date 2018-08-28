package com.practice.programcreek;

public class DeadLock {

	public static void main(String[] args) {
		final String res1 = "Phong Dong";
		final String res2 = "Test DeadLock";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (res1) {
					System.out.println("thread 1: locked res1");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				synchronized (res2) {
					System.out.println("thread 1: locked res2");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (res2) {
					System.out.println("thread 2: locked res2");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				synchronized (res1) {
					System.out.println("thread 2: locked res1");
				}
			}
		};
		
		t1.start();
		t2.start();

	}

}
