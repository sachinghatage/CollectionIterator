package com.map.lambdaexpression.iterate;

import java.util.HashMap;
import java.util.Map;

public class MapIterate {

	public static void main(String[] args) {

		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"C");
		map.put(2,"C++");
		map.put(3,"java");
		map.put(4,"C#");
		map.put(5,"javascript");
		
		map.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);

		});
	}

}
