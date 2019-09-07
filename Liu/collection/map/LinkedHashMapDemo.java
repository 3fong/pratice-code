package map;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 *LinkedHashMap:底层数据结构是链表和哈希表，有序
 *	链表保证顺序，哈希表保证唯一
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,String> lh = new LinkedHashMap<String,String>();
		
		lh.put("zh","chinese");
		lh.put("usa","english");
		lh.put("japan","japanese");
		lh.put("usk","english");
		
		Set<String> keySet = lh.keySet();
		for(String s: keySet){
			String value = lh.get(s);
			System.out.println(s+":"+value);
		}
	}

}
