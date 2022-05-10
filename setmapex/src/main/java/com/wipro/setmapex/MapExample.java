package com.wipro.setmapex;


import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		// Map Interface - Used to store Key Value pairs
		// Key - Student Roll No - Integer
		// value - Total Marks - Integer
		Map<Integer, Integer> studentDetail = new TreeMap<Integer, Integer>();
		studentDetail.put(1100, 89);
		studentDetail.put(1050, 45);
		studentDetail.put(1080, 89);
		studentDetail.put(1030, 67);
		studentDetail.put(1040, 98);
		studentDetail.put(1001, 100); // No Duplicate key
		// StudentDetail.put(null, null); // One Null Key allowed

		System.out.println(studentDetail);
		// A map entry (key-value pair).
		for (Entry<Integer, Integer> hmap : studentDetail.entrySet()) {
			System.out.println(hmap.getKey() + "--" + hmap.getValue());
		}

		// Display Student Roll and marks whose roll is even
		System.out.println("--- Even Roll Numbers---");
		for (Entry<Integer, Integer> map : studentDetail.entrySet()) {
			if (map.getKey() % 2 == 0) {
				System.out.println(map.getKey() + "-->" + map.getValue());
			}
		}

		// Display sum of marks whose student roll number is even
		// Display sum of marks whose student roll number is odd

	}

}
