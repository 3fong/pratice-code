package com.liu.mytest;

import java.lang.reflect.Method;

class Demo{
	private void show(){
		System.out.println("private coming");
	}
}
public class AccessTest {

	public static void main(String[] args)throws Exception {
		Class clazz = Class.forName("����.Demo");

		Method[] mt =clazz.getDeclaredMethods();

		for(Method m : mt){
			System.out.println(m);
		}
	}

}
