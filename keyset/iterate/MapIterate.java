package com.map.keyset.iterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterate {

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"C");
		map.put(2,"C++");
		map.put(3,"java");
		map.put(4,"C#");
		map.put(5,"javascript");
		
		Iterator<Integer> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.println(integer+" "+map.get(integer));
		}
	}

}
