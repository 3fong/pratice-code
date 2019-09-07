package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *在ArrayList<Integer>中添加一个字符串数据
 */
public class TrickGennicDemo {

	public static void main(String[] args) throws Exception{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		Class clazz = al.getClass();
		Method m = clazz.getMethod("add",Object.class);
		m.invoke(al,"张三");
		System.out.println(al);
	}
}
