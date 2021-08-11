package com.tcs.errordemo;

public class ErrorDemo {
	public static void main(String[] args) {
		new ErrorDemo().IndefiniteMethod();
	}
	private void IndefiniteMethod() {
		try {
			IndefiniteMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
