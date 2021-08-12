package com.tcs.autoboxing;

public class AutoBoxingDemo {
	public static void main(String[] args) {
		int a = 10;
		Integer ref = a;
		int b = ref ;
		System.out.println(a == ref);
		System.out.println(a == b);
	}
}
