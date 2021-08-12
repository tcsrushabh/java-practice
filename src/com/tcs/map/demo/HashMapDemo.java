package com.tcs.map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
		//createHashmap();
		treemap();
	}

	private static void treemap() {
		Map<Integer, StudentMarks> mathScores = new TreeMap<Integer , StudentMarks>();
		for (int i = 0; i < 20; i++) {
			mathScores.put( i ,new StudentMarks(new Float(100 * Math.random()) ,new Float(100 * Math.random()) ,new Float(100 * Math.random())));
		}
		

		System.out.println(mathScores);
		
	}

	private static void createHashmap() {
		Map<String, StudentMarks> mathScores = new HashMap<String , StudentMarks>();
		for (int i = 0; i < 20; i++) {
			mathScores.put("student" + i ,new StudentMarks(new Float(100 * Math.random()) ,new Float(100 * Math.random()) ,new Float(100 * Math.random())));
		}
		boolean exists = mathScores.containsKey("student1");
		mathScores.remove("student2");
		mathScores.put("student1",new StudentMarks( 34F,30F,40F));
		System.out.println(mathScores);
	}
}
