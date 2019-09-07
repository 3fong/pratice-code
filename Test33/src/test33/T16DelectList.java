package test33;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * 一个ArrayList对象aList中存有若干个字符串元素，
 *  现欲遍历该ArrayList对象，删除其中所有值为"abc"的字符串元素，
	分析：
		判断字符串是否包含用contains
		难点直接使用Iterator遍历，修改时存在并发访问异常
		解决方法：ListIterator  普通for循环
 */
public class T16DelectList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("fadf");
		al.add("abc");
		al.add("af");
		al.add("abc");
		
		System.out.println(al);
		method1(al);
//		method2(al);		
		System.out.println(al);
	}
	private static void method1(ArrayList<String> al) {
		for(ListIterator<String> li = al.listIterator();li.hasNext();){
			String s = li.next();
			if(s.contains("abc"))
				li.remove();
		}
		for(String s : al){
			System.out.println(s);
		}
	}
	private static void method2(ArrayList<String> al) {
		for(int x=0;x<al.size();x++){
			String s = al.get(x);
			if(s.equals("abc"))
				al.remove(s);
		}
	}
}
