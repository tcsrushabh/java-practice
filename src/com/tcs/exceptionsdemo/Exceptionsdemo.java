package com.tcs.exceptionsdemo;

public class Exceptionsdemo {
	public static void main(String[] args){
		try {
			Demo2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void Demo2() throws MyCheckedException{
		throw new MyCheckedException();
	}
	private static void Demo1() {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Division by zero is not allowed");
		}
	}
}
