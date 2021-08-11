package interfacedemo;

import java.util.ArrayList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		Staff staff = new HR();
		staff.work();
		Staff staff1 = new Guard();
		List<Staff> allstaff = new ArrayList<Staff>();
		allstaff.add(staff);
		allstaff.add(staff1);
		allstaff.add(staff1);
		System.out.println(allstaff.size());
		System.out.println(Staff.count);
	}
}
