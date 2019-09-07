package com.itheima;

import java.lang.reflect.Method;

/*
6、 编写一个类，增加一个实例方法用于打印一条字符串。并使用反射手段创建该类的对象， 并调用该对象中的方法。
*/
class PrintString{
	public void sop(String str){
			System.out.println(str);
	}
}
public class Test6
{
	public static void main(String[] args){
		
		try{
			//加载类
			Class<?> clazz = Class.forName("com.itheima.PrintString");
			
			//获取单个方法
			Method me = clazz.getMethod("sop",String.class);
			//调用该方法
			me.invoke(clazz.newInstance(),"bless u");
		}catch (Exception e) {
            e.printStackTrace();
		}
	}
}