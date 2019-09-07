package new5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 *1、foreach：高级for循环。凡是支持迭代器的集合都支持foreach。
	1.1格式：
	for(数据类型 变量名 : 被遍历的集合（Collection）或数组){}
	1.2特点：
	优点：foreach简化了书写，可对数组、集合进行遍历。
	缺点：只能提出集合元素，不能修改。增强for的目标不能为null。
	PS:
	迭代器：除了遍历，还可以进行remove集合中元素的动作；
	如果是用ListIterator,还可以在遍历过程中对集合进行增删改查的动作。
	传统for和高级for区别：
	高级for有一个局限性：必须有被遍历的目标。
	建议：在遍历数组时，用传统for，因为其可以定义角标。
 */
public class NewForDemo {

	public static void main(String[] args) {
//		getArray();
//		getList();
		getMap();
	}

	private static void getMap() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"afaf");
		map.put(2,"afaf");
		map.put(3,"afaf");
		Set<Integer> set = map.keySet();
		for(Integer i : set){
			String s = map.get(i);
			sop(i+":"+s);
		}
		Set<Map.Entry<Integer,String>> entry = map.entrySet();
		for(Map.Entry<Integer,String> me : entry){
			Integer key = me.getKey();
			String value = me.getValue();
			sop(key+":"+value);
		}
	}

	private static void getList() {
		List<String> list = new ArrayList<String>();
		list.add("afa");
		list.add("afa");
		list.add("afa");
		for(String s: list){
			sop(s);
		}
	}

	private static void getArray() {
		int[] is ={1,2,4,5};
		for(int i : is){
			sop(i);
		}
		Integer[] in={1,2,4,5};
		for(Integer i : in){
			sop(i);
		}
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}		
}
