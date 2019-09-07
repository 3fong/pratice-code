package test33;

import java.lang.reflect.Method;

/*
 *题目：编写一个类，增加一个实例方法用于打印一条字符串。
 * 并使用反射手段创建该类的对象， 并调用该对象中的方法
 */
class PrintString{
	private void show(){
		System.out.println("I am a String");
	}
}
public class T13ReflectDemo {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("test33.PrintString");
		Object obj = clazz.newInstance();
		Method me = clazz.getDeclaredMethod("show",null);
		me.setAccessible(true);
		me.invoke(obj,null);
	}

}
