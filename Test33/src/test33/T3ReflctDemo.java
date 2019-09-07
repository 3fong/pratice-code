package test33;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 *3、 ArrayList<Integer> list = new ArrayList<Integer>(); 
            在这个泛型为Integer的ArrayList中存放一个String类型的对象。
	分析：
		泛型用于限定数据类型，正常情况不能存储其他数据类型。
		反射的暴力访问，可以突破泛型检查，这也是由于ArrayList的add()方法可以接收
		其他数据类型
 */
public class T3ReflctDemo {

	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		Class clazz = list.getClass();
		/*
		 * 因为add()方法的参数列表类型是Object类型
		 * 对于反射,一定需求注意的是反射的对象所被修饰的修饰符是什么?
		 * 如果是public修饰的,直接可以getMethod()这种形式就可以；
		 * 如果是默认的,就需要通过getDeclaredMethod()才可以；
		 * 要是private的话,对不起,必须要通过暴力反射了,就是要通过
		 * getDeclaredMethod(),并设置me.setAccessible(true)来进行设置权限.
		 */
		Method me = clazz.getMethod("add",Object.class);
		me.invoke(list,"爱你");
		System.out.println(list);
	}

}
