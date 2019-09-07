package com.liu.mytest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionTest {

	public static void main(String[] args) {
	
		Map<String,String> map = new TreeMap<String,String>();
		
		map.put("zhangsan","tianjian");
		map.put("zhangsi","tianjian");
		map.put("zhangwu","tianjian");
		
		Set<String> keySet = map.keySet();
		for(Iterator<String> it = keySet.iterator();it.hasNext();){
			String key = it.next();
			
			String value = map.get(key);
			
			System.out.println(key+":"+value);
		}
		
		List<String> ar = new ArrayList<String>();
		
		ar.add("zhao");
		ar.add("qian");
		ar.add("sun");
		
		for(Iterator<String> it =ar.iterator();it.hasNext();){			
			System.out.println(it.next());
		}
	}

}
