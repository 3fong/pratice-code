package test;
/*
 *
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentDemo{
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("test.Man");
		Constructor con = clazz.getConstructor(String.class,int.class);
		Object obj = con.newInstance("¡÷«‡œº",27);
		Man m = (Man)obj;
		System.out.println(m.getName()+":"+m.getAge());
		Method md = clazz.getMethod("setName",String.class);
		
		md.invoke(obj,"zhangsan");
		
		Field field = clazz.getDeclaredField("age");
		field.setAccessible(true);
		field.set(obj,30);
		System.out.println(m.getName()+":"+m.getAge());
	}
}