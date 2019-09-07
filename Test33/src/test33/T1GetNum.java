package test33;

import java.util.Set;
import java.util.TreeMap;

/*
 *1、 取出一个字符串中字母出现的次数。如：字符串："abcdekka27qoq" ，
 * 输出格式为：a(2)b(1)k(2)...
	分析：
		字母和次数具有对应关系，使用map集合，字母有序用TreeMap
		字符串转成数组，获取字符区map集合中取对应的值，并不断更新值，值就是出现次数
		只要字符，需要对字符存入map集合的键进行判断
		用字符缓冲区，缺点输出格式
 */
public class T1GetNum {

	public static void main(String[] args) {
		String s = "abcdekka27qoq";
		String str = show(s);
		System.out.println(str);
	}

	private static String show(String s) {
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		char[] chs = s.toCharArray();
		
		int count =0;
		for(char c : chs){
			if(Character.isLowerCase(c)||Character.isUpperCase(c)){
				Integer value = tm.get(c);
				if(value!=null)
					count=value;
				count++;
				tm.put(c,count);
				count=0;
			}
		}
		StringBuilder sb = new StringBuilder();
		Set<Character> set = tm.keySet();
		for(Character c : set){
			Integer value = tm.get(c);
			sb.append(c+"("+value+")");
		}
		return sb.toString();
	}

}
