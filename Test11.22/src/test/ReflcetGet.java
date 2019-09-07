package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person{
	private int age;
	private String name;
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	public void getName(){
		System.out.println("name");
	}
	private void getAge(){
		System.out.println("age");
	}
	public String toString(){
		return age+":"+name;
	}
}
public class ReflcetGet {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("test.Person");

		Method[] methods=clazz.getDeclaredMethods();
		
		for(Method m : methods){
			System.out.println(m);
		}
		
		Field[] files = clazz.getDeclaredFields();
		
		for(Field f : files){
//			f.setAccessible(true);
			System.out.println(f);
		}
	}

}
