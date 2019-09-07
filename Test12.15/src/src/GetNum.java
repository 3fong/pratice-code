package src;

import java.util.Set;
import java.util.TreeMap;

/*
 *计算出ldkafskgha里面所有字母出现的次数输出方式为：l(1)d(1)……
 *分析：
 *		将字符串转成字符数组，存入集合
 *		字母和数字具有对象关系，用Map，需要排序用TreeMap
 *		定义计数器，遍历字符数组，将值通过集合的get方法为计数器赋值
 *		输出最好是具体值，用到字符缓冲区
 */
public class GetNum {

	public static void main(String[] args) {
		String s = "ldkafskgha";
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		char[] chs = s.toCharArray();
		
		int count = 0;
		for(char c : chs){
			Integer value = tm.get(c);
			if(value!=null)
				count=value;
			count++;
			tm.put(c, count);
			count=0;
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = tm.keySet();
		for(Character c : set){
			Integer value = tm.get(c);
			sb.append(c+"("+value+")");
		}
		System.out.println(sb.toString());
	}

}
