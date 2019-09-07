package map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 *需求 ："aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 *分析：
 *		字符和次数，可看出键值对应关系，使用Map集合，需要排序用TreeMap
 *		TreeMap的键值对应该是字符和数字
 *		定义计数器
 *		进行值判断，键为null，值为1；
 *				键不为null，值+1
 *		输出，用StringBuilder定义格式		
 */
public class GetStringNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String s = show1(str);
		System.out.println(s);
	}
	public static String show(String s){
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		char[] chs = s.toCharArray();
//		for(int x=0;x<chs.length;x++){
//			char ch = chs[x];
		
		for(char ch : chs){
			Integer i = tm.get(ch);
			if(i==null){
				tm.put(ch,1);
			}else{
				i++;
				tm.put(ch,i);
				
			}
		}
		StringBuilder sb = new StringBuilder();
		
		Set<Character> keySet = tm.keySet();
		for(Character c : keySet){
			Integer i = tm.get(c);
			sb.append(c+"("+i+")");
		}
		return sb.toString();
	}
	public static String show1(String s){
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		char[] chs = s.toCharArray();
		int count=0;
		for(char ch : chs){
			Integer i = tm.get(ch);
			
			//可以在这加入筛选信息。获取标的取值范围，排除不需要信息
//			if(!(ch>='a'&& ch<='z' || ch>='A' && ch<='Z'))
//				continue;
			if(i!=null)
				count=i;
			count++;
			tm.put(ch,count);
			count=0;
		}
		
		StringBuilder sb = new StringBuilder();
		
		Set<Map.Entry<Character,Integer>> entrySet = tm.entrySet();
		for(Map.Entry<Character,Integer> me : entrySet){
			Character cha = me.getKey();
			Integer in = me.getValue();
			sb.append(cha+"("+in+")");
		}
		return sb.toString();
	}
}
