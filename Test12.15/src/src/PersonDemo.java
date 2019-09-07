package src;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *用反射将被public和private的成员变量和方法取出来
 */
class Person {
	private String name;
	public int age;
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class PersonDemo{
	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("src.Person");
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields){
			System.out.println(f);
		}
		Method[] mes = clazz.getDeclaredMethods();
		for(Method m : mes){
			System.out.println(m);
		}
	}
}