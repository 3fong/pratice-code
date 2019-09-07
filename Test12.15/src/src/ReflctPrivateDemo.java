package src;

import java.lang.reflect.Method;

/*
 *用反射将被私有修饰的方法获取出来
 */
class Person2{
	private void show(){
		System.out.println("show");
	}
	public void method(){
		System.out.println("method");
	}
}
public class ReflctPrivateDemo {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("src.Person2");
			Object obj = clazz.newInstance();
			Method me = clazz.getDeclaredMethod("show");
			me.setAccessible(true);
			me.invoke(obj);			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}
