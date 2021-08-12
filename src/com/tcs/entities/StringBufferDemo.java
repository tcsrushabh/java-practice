package com.tcs.entities;

public class StringBufferDemo {
	public static void main(String[] args) {
		String literal = "TCS"; //Stored in string pool
		String newkeyword = new String("TCS");//Stored in heap
		StringBuilder strBuilder = new StringBuilder("TCS");//Stored in heap , not thread-safe
		StringBuffer strBuffer = new StringBuffer("TCS");//Stored in heap , not thread-safe
	}
}
