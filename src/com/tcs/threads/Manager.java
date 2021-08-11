package com.tcs.threads;

public class Manager {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Worker w1 = new Worker();
			Thread t1 = new Thread(w1);
			t1.setPriority(10);
			t1.start();
			System.out.println(Thread.currentThread().toString()+i);
		}
	}
}