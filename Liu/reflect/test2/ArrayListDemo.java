package test2;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *�Ҹ���ArrayList<Integer>��һ������������������������һ���ַ������ݣ����ʵ���أ�
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
