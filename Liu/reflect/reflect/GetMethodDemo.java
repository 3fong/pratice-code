package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 *ͨ�������ȡ���ļ��ķ���
 *public Method getMethod(String name,Class<?>... parameterTypes)
	��һ��������ʾ�ķ��������ڶ���������ʾ���Ƿ����Ĳ�����class����
  public Object invoke(Object obj,Object... args)
	����ֵ��Object����,��һ��������ʾ������˭���ڶ�������ʾ���ø÷�����ʵ�ʲ���
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
	//��ȡ����˽�з���
	private static void getMethod3(Class c, Object obj) throws Exception{
		Method md = c.getDeclaredMethod("function");
		md.setAccessible(true);
		md.invoke(obj);
	}
	//��ȡ������η���
	private static void getMethod2(Class c, Object obj) throws Exception{
		Method md = c.getMethod("getString",String.class,int.class);		
		Object o = md.invoke(obj,"����ϼ",27);
		System.out.println(o);
	}
	//��ȡ�����вη���
	private static void getMethod1(Class c, Object obj) throws Exception{
		Method md = c.getMethod("method",String.class);
		md.invoke(obj," ���");
	}
	//��ȡ�����޲η���
	private static void getMethod(Class c, Object obj) throws Exception{
		Method md = c.getMethod("show");
		md.invoke(obj);
	}

	private static void getMethods1(Class c) {
		//��ȡ�Լ�������Ĺ�������
		Method[] methods = c.getMethods();
		for(Method m : methods){
			System.out.println(m);
		}
	}

	private static void getMethods(Class c) {
		//��ȡ�Լ����з���
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m);
		}
	}

}
