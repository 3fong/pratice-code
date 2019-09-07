package test;

import java.lang.reflect.Method;

/*
 *4.用反射将被私有修饰的方法获取出来
 */
public class ReflectDemo {

	public static void main(String[] args) {
		try {
			//获取类的字节码文件和创建实例
			Class clazz = Class.forName("test.Person");
			Object obj = clazz.newInstance();
			
			//因为访问私有方法，所以需要通过暴力访问获取访问权限
			Method me = clazz.getDeclaredMethod("method");
			me.setAccessible(true);
			me.invoke(obj);
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
