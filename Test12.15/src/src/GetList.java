package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *�ô���ʵ��List��map ��ȡ���ݲ���ʹ�÷���
 */
public class GetList {

	public static void main(String[] args) {
		getList();
		getMap();
	}

	private static void getMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(2,"�й�");
		map.put(2,"�й�");
		map.put(3,"������");
		map.put(4,"�ն���");
		
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		for(Map.Entry<Integer,String> me : set){
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"::"+value);
		}
	}

	private static void getList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(12);
		list.add(21);
		
		for(Integer i : list){
			System.out.println(i);
		}
	}

}
