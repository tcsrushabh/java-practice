package com.tcs.set.examples;



public class User1 implements Comparable<User1>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return Integer.toString(age);
	}
	@Override
	public int compareTo(User1 u1) {
		return u1.getAge() - this.getAge();
	}
	

}
