package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 *通过反射获取类文件的方法
 *public Method getMethod(String name,Class<?>... parameterTypes)
	第一个参数表示的方法名，第二个参数表示的是方法的参数的class类型
  public Object invoke(Object obj,Object... args)
	返回值是Object接收,第一个参数表示对象是谁，第二参数表示调用该方法的实际参数
 */
public class GetMethodDemo {

	public static void main(String[] args) throws Exception{
		Class c = Class.forName("reflect.Person");
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
//		getMethods(c);
//		getMethods1(c);
//		getMethod(c,obj);
//		getMethod1(c,obj);
//		getMethod2(c,obj);
		getMethod3(c,obj);
	}
	//获取单个私有方法
	private static void getMethod3(Class c, Object obj) throws Exception{
		Method md = c.getDeclaredMethod("function");
		md.setAccessible(true);
		md.invoke(obj);
	}
	//获取单个多参方法
	private static void getMethod2(Class c, Object obj) throws Exception{
		Method md = c.getMethod("getString",String.class,int.class);		
		Object o = md.invoke(obj,"林青霞",27);
		System.out.println(o);
	}
	//获取单个有参方法
	private static void getMethod1(Class c, Object obj) throws Exception{
		Method md = c.getMethod("method",String.class);
		md.invoke(obj," 你哈");
	}
	//获取单个无参方法
	private static void getMethod(Class c, Object obj) throws Exception{
		Method md = c.getMethod("show");
		md.invoke(obj);
	}

	private static void getMethods1(Class c) {
		//获取自己及父类的公共方法
		Method[] methods = c.getMethods();
		for(Method m : methods){
			System.out.println(m);
		}
	}

	private static void getMethods(Class c) {
		//获取自己所有方法
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m);
		}
	}

}
