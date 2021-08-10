package com.tcs.entities;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String args[]) {
		//demo1();
		EnhancedforLoop();
	}
	private static void EnhancedforLoop() {
		int[] numbers = {3,4,-1,2,6};
		for(int number : numbers) {
			if(number % 2 == 0) {
				System.out.println(number);
			}
		}
	}
	private static void demo1() {
		int[] numbers = new int[10];
		numbers[0]=3;
		numbers[4]=1;
		Arrays.sort(numbers,0,numbers.length-2);
		for(int i=0;i<10;i++) {
			System.out.println(numbers[i]);
		}
	}
}
