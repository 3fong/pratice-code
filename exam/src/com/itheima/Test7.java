package com.itheima;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 7、 定义一个标准的JavaBean，名叫Person，包含属性name、age。使用反射的方式创建一个
 * 实例、调用构造函数初始化name、age，使用反射方式调用setName方法对名称进行设置，不使用
 * setAge方法直接使用反射方式对age赋值。
*/
//定义Person类，包含属性name、age。
class Person {  
		private String name;  
    		private int age;      
    		public Person() {  
        	super();          
	}  
    	public Person(String name, int age) {  
        	super();  
        	this.name = name;  
        	this.age = age;  
        	System.out.println("name:"+name+"age:"+age);  
	}  
    	public String getName() {  
        	return name;  
	}  
    	public void setName(String name) {  
        	this.name = name;  
        	System.out.println(name);  
    	}  
    	public int getAge() {  
        	return age;  
    	}  
    	public void setAge(int age) {  
        	this.age = age;  
	}  
} 
class Test7 
{
	public static void main(String[] args) throws Exception{  
		getConstructor();  
	}  
	public static void getConstructor() throws Exception{
		//获取目标类字节码文件
		Class<?> clazz = Class.forName("com.itheima.Person");  
		
		///调用构造函数初始化name、age
		Constructor<?> constructor = clazz.getConstructor(String.class,int.class); 
		
		//使用反射的方式创建一个实例
		Object obj = constructor.newInstance("小强",29);  
		
		//使用反射方式调用setName方法对名称进行设置
		Method method = clazz.getMethod("setName", String.class); 
		method.invoke(obj, "李四"); 
		
		//不使用setAge方法直接使用反射方式对age赋值
		Field field = clazz.getDeclaredField("age");
		//允许反射私有方法
		field.setAccessible(true);
		//获取字段类型
		Class<?> type = field.getType();
		if(type.equals(int.class)){
			field.set(obj, 98);
			int age = field.getInt(obj);
			System.out.println("反射直接赋值："+age);
		}
	}  
}