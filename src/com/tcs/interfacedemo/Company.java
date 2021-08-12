package com.tcs.interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		IStaff staff = new HR();
		staff.work();
		IStaff staff1 = new Guard();
		List<IStaff> allstaff = new ArrayList<IStaff>();
		allstaff.add(staff);
		allstaff.add(staff1);
		allstaff.add(staff1);
		System.out.println(allstaff.size());
		System.out.println(IStaff.count);
	}
}
