package com.tcs.entities;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String args[]) {
		int[] numbers = new int[10];
		numbers[0]=3;
		numbers[4]=1;
		Arrays.sort(numbers,0,numbers.length-2);
		for(int i=0;i<10;i++) {
			System.out.println(numbers[i]);
		}
	}
}
