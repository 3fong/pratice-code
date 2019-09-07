package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *获取功能：
 * V get(Object key):根据键获取值
 * Set<K> keySet():获取集合中所有键的集合
 * Collection<V> values():获取集合中所有值的集合
 * Set<Map.Entry<K,V>> entrySet()：返回的是键值对对象的集合
 * Map集合是两种遍历方式和一种取出值方式，前两种方法都是将获取对象存入Set集合中，所以键是唯一的
 * 	后一种是存入Collection集合中。
 */
public class GetDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("liling","chuyi");
		map.put("guocaiye","chusan");
		map.put("longzhu","ershi");
		map.put("guocaiye","chusan");
		


	}
	//遍历方式一：通过键遍历获取值
	public static void getMap(Map<String,String> map){
		Set<String> set = map.keySet();
		for(String s : set){
			String value = map.get(s);
			System.out.println(s+":"+value);
		}
	}
	//遍历方式二：通过键值对对象遍历获取键和值
	public static void getMap1(Map<String,String> map){
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		for(Map.Entry<String,String> me : entrySet){
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":"+value);
		}
	}
	//通过values()方法获取map集合中所有值。
	public static void getMapValues(Map<String,String> map){
		Collection<String> col = map.values();
		
		for(String s: col){
			System.out.println(s);
		}
	}
}
