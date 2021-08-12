package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		List<Integer> myList = createList();
		System.out.println(myList);
		myList.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println("After sorting : "+myList);
	}

	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int count = 0; count < 20; count++) {
			numbers.add(count); //autoboxing
		}
		
		return numbers;
	}
	
}
