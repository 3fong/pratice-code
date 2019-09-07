package com.itheima;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 7�� ����һ����׼��JavaBean������Person����������name��age��ʹ�÷���ķ�ʽ����һ��
 * ʵ�������ù��캯����ʼ��name��age��ʹ�÷��䷽ʽ����setName���������ƽ������ã���ʹ��
 * setAge����ֱ��ʹ�÷��䷽ʽ��age��ֵ��
*/
//����Person�࣬��������name��age��
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
		//��ȡĿ�����ֽ����ļ�
		Class<?> clazz = Class.forName("com.itheima.Person");  
		
		///���ù��캯����ʼ��name��age
		Constructor<?> constructor = clazz.getConstructor(String.class,int.class); 
		
		//ʹ�÷���ķ�ʽ����һ��ʵ��
		Object obj = constructor.newInstance("Сǿ",29);  
		
		//ʹ�÷��䷽ʽ����setName���������ƽ�������
		Method method = clazz.getMethod("setName", String.class); 
		method.invoke(obj, "����"); 
		
		//��ʹ��setAge����ֱ��ʹ�÷��䷽ʽ��age��ֵ
		Field field = clazz.getDeclaredField("age");
		//������˽�з���
		field.setAccessible(true);
		//��ȡ�ֶ�����
		Class<?> type = field.getType();
		if(type.equals(int.class)){
			field.set(obj, 98);
			int age = field.getInt(obj);
			System.out.println("����ֱ�Ӹ�ֵ��"+age);
		}
	}  
}