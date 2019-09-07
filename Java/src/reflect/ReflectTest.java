package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *预定义的Class实例对象
	 包括：八个基本数据类型（byte、short、int、long、float、double、char和
	 boolean）和关键字 void； 基本数据类型的字节码都可以拥与之对应的包装类中的TYPE常量表示。
	如：基本数据类型int，它对应的包装类是Integer类，所以：int.class == Integer.TYPE。
	 只要是在源程序中出现的类型，都有各自的Class实例对象。如：int[].class、void.class。
 */
class MyMain{
	public static void main(String[] args){
		for(String s :args)
			System.out.println(s);
	}
}
public class ReflectTest {

	public static void main(String[] args) throws Exception {
//		Class clazz = Class.forName("reflect.Person");
		// baseType();
//		getType(clazz);
		visitMain();
	}
	//访问主函数
	private static void visitMain() throws Exception{
		//调用main方法,普通方式。
//		MyMain.main(new String[]{"aaa","222","333"});
		
		//反射方式。适用于不知道具体类名的情形。
		Class clazz = Class.forName("reflect.MyMain");
		Method me = clazz.getMethod("main",String[].class);
		
		/*
		 * jdk1.4和jdk1.5的invoke方法的区别：
			jdk1.5：public Object invoke(Object obj,Object...args)
			jdk1.4：public Object invoke(Object obj,Object...[] args)
			下面的错误就是因为jdk1.5兼容1.4引起的参数异常。
		 */
		//IllegalArgumentException:wrong number of arguments.
//		me.invoke(null,new String[]{"aaa","222","333"});
		//两种正确写法。告诉虚拟机这是一个整体，不要拆开
		me.invoke(null,new Object[]{new String[]{"aaa","222","333"}});
//		me.invoke(null,(Object)new String[]{"aaa","222","333"});
	}

	private static void baseType() {
		sop(int.class.isPrimitive());// 判断是否是基本数据类型
		sop(String.class.isPrimitive());// false
		sop(int.class == Integer.class);// false基础数据类型和其包装类不同
		sop(int.class == Integer.TYPE);// true
		sop(int[].class.isPrimitive());// false数组有自己字节码类型，但是不是基础数据类型
		sop(void.class.isPrimitive());// true
	}

	private static void getType(Class clazz) throws Exception {
		// 因为构造方法私有，必须通过方法获取
		Constructor con = clazz.getDeclaredConstructor(String.class, int.class);
		con.setAccessible(true);// 访问私有构造方法不设置访问权限，可以通过编译，但会运行异常
		Person p = (Person) con.newInstance("zhans", 27);

		// 因为成员变量是私有的要通过方法获取
		Field fi = clazz.getDeclaredField("name");
		fi.setAccessible(true);
		sop(fi.get(p));
		// sop(name);
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
