package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Arraylistdemo {

	public static void main(String[] args) {
		List<Integer> myList = createList();
		//SortList(myList);
		filterList(myList);
	}

	private static void filterList(List<Integer> myList) {
		myList.forEach((number) ->{
			System.out.println(number % 2 == 0);
		});
		List<Integer> filter = myList.stream()
						.filter((number) -> number % 2 == 0)
						.collect(Collectors.toList());
		System.out.println(filter);
	}

	private static void SortList(List<Integer> myList) {
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
