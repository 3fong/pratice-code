package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *��ArrayList<Integer>�����һ���ַ�������
 */
public class TrickGennicDemo {

	public static void main(String[] args) throws Exception{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		Class clazz = al.getClass();
		Method m = clazz.getMethod("add",Object.class);
		m.invoke(al,"����");
		System.out.println(al);
	}
}
