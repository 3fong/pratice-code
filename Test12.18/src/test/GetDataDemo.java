package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *3.�ô���ʵ��List��map ��ȡ���ݲ���ʹ�÷���
 */
public class GetDataDemo {

	public static void main(String[] args) {
		myList();
		myMap();
	}
	//Map�������ݴ洢
	private static void myMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(007,"james");
		map.put(9686,"����");
		map.put(1218,"me");
		
		getMap(map);
	}
	//Map�������ݻ�ȡ
	private static void getMap(Map<Integer, String> map) {
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		for(Map.Entry<Integer,String> me : set){
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":"+value);
		}
	}
	//list�������ݴ洢
	private static void myList() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("i like today");
		list.add("wait");
		list.add("me");
		
		getList(list);
	}
	//list��������ȡ��
	private static void getList(List<String> list) {
		for(String s : list){
			System.out.println(s);
		}
	}

}
