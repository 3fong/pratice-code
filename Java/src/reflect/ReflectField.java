package reflect;

import java.lang.reflect.Field;

/*
 *获取成员变量
 *	Field getField(String name):返回的公共成员字段；
 *	Field getDeclaredField(String name)
 	Field[] getFields():返回包含共有成员字段的数组；
 	Field[] getDeclaredFields():返回包含类中成员字段的数组；
 	set(Object obj,Object value)//设置对象的指定成员变量值
 	Object get(Object obj)：返回指定对象上此 Field 表示的字段的值


 */
public class ReflectField {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("reflect.Person");
//		myField1(clazz);
//		myField2(clazz);
//		myField3(clazz);
		myField4(clazz);
	}
	
	private static void myField1(Class clazz) throws Exception{
		Person p = (Person)clazz.newInstance();
		Field fi = clazz.getField("address");
		fi.set(p,27);
		System.out.println(fi.get(p));
	}

	//为对象赋值，必须有对象，set(对象名,参数新值);
	private static void myField2(Class clazz) throws Exception{
		Person p = (Person)clazz.newInstance();
		Field fi = clazz.getDeclaredField("age");		
//		fi.setAccessible(true);
		fi.set(p,27);
		System.out.println(fi.get(p));
	}
	//获取全部共有成员变量
	private static void myField3(Class clazz) {
		Field[] fis = clazz.getFields();
		for(Field f : fis){
			System.out.println(f);
		}
	}
	//获取所有成员变量，共有、私有
	private static void myField4(Class clazz) {
		Field[] fis = clazz.getDeclaredFields();
		for(Field f : fis){
			System.out.println(f);
		}
	}

}
