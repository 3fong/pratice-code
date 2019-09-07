package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 *Method getMethod(String name,parameterTypes):返回公共成员方法；空参数，参数列表为null
	Method getDeclaredMethod(String name,parameterTypes):返回所有成员方法；
	Method[] getMethods()：获取本类和父类中的公共方法。
	Method[] getDeclaredMethods()：获取本类中包含私有。
	Object invoke(Object obj ,参数)：调用方法。如果方法是静态，对象参数为null。
	如：
	一般方式：str.charAt(1);
	反射方式：p.invoke(str,1);若第一个参数为null，代表Method方法对应的是一个静态方法。
 */
public class ReflectMethod {

	public static void main(String[] args) throws Exception{
		Class clazz =Class.forName("reflect.Person");
//		myMethod(clazz);
//		myMethod1(clazz);
//		myMethod2(clazz);
//		myMethod3(clazz);
		myMethod4(clazz);
	}
	//获取方法静态数据
	private static void myMethod(Class clazz) throws Exception {
//		Person p = (Person)clazz.newInstance();
		Method m = clazz.getMethod("show");
		m.invoke(null,null);//第一个null表明是静态方法，第二个null表明方法参数列表为空
	}
	private static void myMethod1(Class clazz) throws Exception{
		Constructor con = clazz.getDeclaredConstructor(String.class,int.class);
		con.setAccessible(true);
		Object obj = con.newInstance("zhangsn",27);
		
		Method m = clazz.getMethod("setAge",int.class);
		m.invoke(obj,28);
		Method m2 = clazz.getMethod("getAge",null);
		Object o2 = m2.invoke(obj,null);
		System.out.println(o2);
	}
	//获取部分方法值
	private static void myMethod2(Class clazz) throws Exception{
		Person p = (Person)clazz.newInstance();
		Method m = clazz.getDeclaredMethod("setName",String.class);
		m.setAccessible(true);
		Object o = m.invoke(p,"林青霞");

		Method m2 = clazz.getDeclaredMethod("getName");
		m2.setAccessible(true);
		Object o2 = m2.invoke(p);
		String s = (String)o2;
		System.out.println(s);
	}
	//获取本类和父类中的公共方法。
	private static void myMethod3(Class clazz) {
		Method[] mes = clazz.getMethods();
		for(Method m : mes){
			System.out.println(m);
		}
	}

	private static void myMethod4(Class clazz) {
		Method[] mes = clazz.getDeclaredMethods();
		for(Method m : mes){
			System.out.println(m);
		}
	}

}
