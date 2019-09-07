package faceObject;

import java.lang.reflect.Method;

/*
 *成员内部类不是静态的：
		外部类名.内部类名 对象名 = 外部类对象.内部类对象;
		Outer.Inner oi = new Outer().new Inner();
      成员内部类是静态的：
		外部类名.内部类名 对象名 = new 外部类名.内部类名();
		非静态方法：Outer.Inner oi = new Outer.Inner();
		直接用类名调用静态方法：Outer.Inner.show2();
 */
class Outer{
	int x=1;
	//一般类不可以被private修饰，但当内部类在成员位置上时可以。
	private class Inner{
		public void play(){
			System.out.println(x);
		}
	}
	//静态修饰内部类相当于成员方法
	public static class Inner1{
		int x = 3;
		public void show(){
			int x =6;
			System.out.println(x);
			System.out.println(this.x);
		}
		public static void show1(){
			System.out.println(new Outer().x);
			//被静态修饰后，就不能访问外部成员变量，因为静态先初始化
//			System.out.println(Outer.this.x);
		}
	}
	
	//内部类被私有后，外部无法直接访问，只能通过外部类方法访问
	void method(){
		Inner i = new Inner();
		i.play();
	}
}
public class InnerClass1 {

	public static void main(String[] args) throws Exception{
		//用反射访问内部类
		//Class clazz = Class.forName("faceObject.Inner");
//		Object obj = clazz.newInstance();
//		Method md = clazz.getDeclaredMethod("show");
//		md.setAccessible(true);
//		md.invoke(obj);
		
		Outer o = new Outer();
		o.method();
		
		//访问静态内部类的非静态方法
		Outer.Inner1 oi = new Outer.Inner1();
		oi.show();
		//访问静态内部类的静态方法
		Outer.Inner1.show1();
	}

}
