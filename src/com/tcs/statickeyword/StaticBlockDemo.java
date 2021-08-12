package com.tcs.statickeyword;

public class StaticBlockDemo {
	private static int age =10;
	int price = 19;
	static {
		final int a = 10 ;
		System.out.println("In block"+ age );
	}
	public StaticBlockDemo() {
		System.out.println("In constructor");
	}
	public static void main(String[] args) {
		//StaticBlockDemo blockDemo = new StaticBlockDemo();
		
	}
}
