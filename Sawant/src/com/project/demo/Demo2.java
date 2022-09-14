package com.project.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Krushnat");
		list.add("Rohit");
		list.add("Rushikesh");
		list.add("Gayatri");
		
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("Group W members :",list);
		
		Set<String> set = map.keySet();
		for (Object o: set) {
			System.out.println(o);
			System.out.println(map.get(o));
		}

		}

}
