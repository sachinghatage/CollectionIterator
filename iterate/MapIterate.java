package com.map.iterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterate {

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"C");
		map.put(2,"C++");
		map.put(3, "Java");
		map.put(4,"C#");
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer,String> entry = iterator.next();
			System.out.println(entry);
		}
	}

}
