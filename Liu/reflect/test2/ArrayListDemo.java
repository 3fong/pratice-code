package test2;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 */
public class ArrayListDemo {

	public static void main(String[] args) throws Exception{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		Class c = al.getClass();
		Method md = c.getMethod("add",Object.class);
		md.invoke(al,"hello");
		md.invoke(al,"world");
		md.invoke(al,"java");
		System.out.println(al);
	}

}
