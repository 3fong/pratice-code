package test33;

import java.lang.reflect.Method;

/*
 *题目：方法中的内部类能不能访问方法中的局部变量，为什么？
 *可以访问加final的局部变量。
 */
class Outer{
	public Object method(){
		final int x = 5;
		class Inner{
			public void run(){
				//不对局部变量进行引用型操作，final可以不加，加上后就不能再赋值
				System.out.println(x);
			}
		}
		Inner i = new Inner();
		i.run();
		return i;//返回Inner对象方便用反射调用
	}
}
public class T11InnerClassDemo {

	public static void main(String[] args) throws Exception{
		Outer o = new Outer();
		Object obj = o.method();
		
		Class clazz = obj.getClass();
		Method me = clazz.getMethod("run");
		me.invoke(obj);
	}

}
