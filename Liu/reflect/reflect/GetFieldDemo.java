package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 *通过反射获取成员变量并使用
 */
public class GetFieldDemo {

	public static void main(String[] args) throws Exception{
		Class c = Class.forName("reflect.Person");
		//因为访问成员变量，必须要有对象
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);
		
//		getField(c,obj);
//		getField1(c,obj);
//		getFields(c);
		getFields1(c);
	}
	
	private static void getFields1(Class c) {
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields){
			System.out.println(f);
		}
	}

	private static void getFields(Class c) {
		//获取公共成员变量
		Field[] fields = c.getFields();
		for(Field f : fields){
			System.out.println(f);
		}
	}

	private static void getField1(Class c, Object obj) throws Exception{
		//访问私有成员变量
		Field field = c.getDeclaredField("name");
		field.setAccessible(true);
		field.set(obj,"张三");
		System.out.println(obj);
	}

	private static void getField(Class c,Object obj) throws Exception{
		//访问公共成员变量
		Field field = c.getField("address");
		field.set(obj,"北京");
		System.out.println(obj);
	}
	
}
