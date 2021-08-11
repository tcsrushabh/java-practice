package com.tcs.abstraction;

public class Company {

	public static void main(String[] args) {
		Staff staff = new HR();
		Staff staff1 = new Guard();
		staff.work();
		staff1.work();
	}

}
