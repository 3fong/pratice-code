package test33;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *11.題目:编写一个类，在main方法中定义一个Map对象（采用泛型），
 * 加入若干个对象，然后遍历并打印出各元素的key和value。

 */
public class T10MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(007,"bangde");
		map.put(006,"james");
		map.put(005,"华安");
		
		Set<Integer> set = map.keySet();
		for(Integer s : set){
			String str = map.get(s);
			System.out.println(s+":"+str);
		}
	}

}
