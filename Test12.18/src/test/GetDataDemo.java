package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *3.用代码实现List和map 存取数据并且使用泛型
 */
public class GetDataDemo {

	public static void main(String[] args) {
		myList();
		myMap();
	}
	//Map集合数据存储
	private static void myMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(007,"james");
		map.put(9686,"华安");
		map.put(1218,"me");
		
		getMap(map);
	}
	//Map集合数据获取
	private static void getMap(Map<Integer, String> map) {
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		for(Map.Entry<Integer,String> me : set){
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":"+value);
		}
	}
	//list集合数据存储
	private static void myList() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("i like today");
		list.add("wait");
		list.add("me");
		
		getList(list);
	}
	//list集合数据取出
	private static void getList(List<String> list) {
		for(String s : list){
			System.out.println(s);
		}
	}

}
