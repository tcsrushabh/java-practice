package com.tcs.set.examples;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
	public static void main(String[] args) {
//		demo1();
		treesetDemo();
	}

	private static void treesetDemo() {
		
		
	}

	private static void demo1() {
		Set<User1> users = createset();
		//System.out.println(users);
		User1 userWithsameAge = new User1();
		userWithsameAge.setAge(10);
		users.add(userWithsameAge);
		System.out.println(users);
	}

	private static Set<User1> createset() {
		Set<User1> users = new HashSet<User1>();
		for(int i=0 ; i < 20; i++) {
			User1 user = new User1();
			user.setAge(10+i);
			users.add(user);
		}
		return users;
	}
}
