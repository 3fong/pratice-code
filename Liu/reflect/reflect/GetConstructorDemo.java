package reflect;

import java.lang.reflect.Constructor;

/*
 *通过反射获取构造方法并使用。
 *	public Constructor[] getConstructors():所有公共构造方法
 *	public Constructor[] getDeclaredConstructors():所有构造方法
 *
 *	public Constructor<T> getConstructor(Class<?>... parameterTypes)
	参数表示的是：你要获取的构造方法的构造参数个数及数据类型的class字节码文件对象
	
	public T newInstance(Object... initargs)
	使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
 */
public class GetConstructorDemo {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("reflect.Person");
		
//		getCons1(c);
//		getCon(c);
		getCon2(c);
	}
	//获取公共构造方法
	public static void getCons1(Class c){
		// 获取公共构造方法 
//		Constructor[] cons = c.getConstructors();
//		for(Constructor con : cons){
//			System.out.println(con);
//		}
		//获取所有构造方法
		Constructor[] cons = c.getDeclaredConstructors();
		for(Constructor con :cons){
			System.out.println(con);
		}
		
	}
	//获取单个构造方法
	public static void getCon(Class c) throws Exception{
		//无参
//		Constructor con = c.getConstructor();
	
//		Object obj = con.newInstance();
//		System.out.println(obj);
		
		//访问私有字段
		Constructor con1 = c.getDeclaredConstructor(String.class,int.class);
		//暴力访问
		con1.setAccessible(true);
		Object obj1 = con1.newInstance("zhangsan",27);
		System.out.println(obj1);
	}
	//需求：通过反射去获取该构造方法并使用：
	public static void getCon2(Class c) throws Exception{
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("林青霞",27,"北京");
		System.out.println(obj);
	}
}
