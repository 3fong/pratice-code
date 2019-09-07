package test33;

import java.lang.reflect.Method;

/*
 *编写一个类，增加一个实例方法用于打印一条字符串。
 * 并使用反射手段创建该类的对象， 并调用该对象中的方法。
 */
class PrintStr{
	public void printStr(String str){
		System.out.println(str);
	}
}
public class T18ReflectMethodDemo {
	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("test33.PrintStr");
		Object obj = clazz.newInstance();
		
		Method me = clazz.getMethod("printStr",String.class);
		me.invoke(obj,"加油，小伙儿！");
	}

}
