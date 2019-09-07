package collection;
//增强for循环遍历取出集合元素
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ForeachDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"a");
		hm.put(3,"c");
		hm.put(2,"b");
		
		Set<Integer> keySet = hm.keySet();
		for(Integer i : keySet){
			System.out.println(i+":"+hm.get(i));
		}
		
//		Set<Map.Entry<Integer,String>> entrySet = hm.entrySet();
		for(Map.Entry<Integer,String> me : hm.entrySet()){
			System.out.println(me.getKey()+"......."+me.getValue());
		}
	}

}
