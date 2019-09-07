package test33;

import java.lang.reflect.Method;

/*
 *13：定义一个交通灯枚举，包含红灯、绿灯、黄灯，
 *  需要有获得下一个灯的方法，例如：红灯获取下一个灯是绿灯，绿灯获取下一个灯是黄灯。
	1.枚举说实在的,就是把自己的子类都放自己身上.自己的这些元素,就是自己的子类对象.
 *  2.子类复写父类方法.返回类型如果是枚举元素,那么就是枚举类型.
 *  3.enum,才代表是枚举类.枚举中的元素要写在最开始位置.
 *  4.枚举也可以说,在java中属于一个较安全的体系.对元素进行了必要的限制操作.而且是反射无法破解的.

 */
class Red{
	public Green next(){
		System.out.println("red");
		return new Green();
	}
}
class Green{
	public Yellow next(){
		System.out.println("green");
		return new Yellow();
	}
}
class Yellow{
	public Red next(){
		System.out.println("yellow");
		return new Red();
	}	
}
enum traffic{
	RED {
		@Override
		public traffic next() {
			return GREEN;
		}
	},GREEN {
		@Override
		public traffic next() {
			return YELLOW;
		}
	},YELLOW {
		@Override
		public traffic next() {
			return RED;
		}
	};
	public abstract traffic next(); 
}
public class T12EnumDemo {
	public static void main(String[] args) throws Exception{
		traffic t = traffic.RED.next();
		System.out.println(t);
		
		//InstantiationException 指定的类对象无法被实例化
		Class clazz = t.getClass();
		Object obj = clazz.newInstance();
		Method me = clazz.getMethod("next");
		me.invoke(obj);
	}
}
