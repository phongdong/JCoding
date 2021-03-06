package com.practice.programcreek;

class Customer {
	private int amount = 10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw");
		if (this.amount < amount) {
			System.out.println("less balance, please wait for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount += amount;
		System.out.println("deposit completed");
		notify();
	}
	
}


public class InterThread {

	public static void main(String[] args) {
		final Customer customer = new Customer();
		
		new Thread() {
			public void run() {
				customer.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
		}.start();
	}

}
