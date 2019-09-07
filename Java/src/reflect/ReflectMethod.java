package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 *Method getMethod(String name,parameterTypes):���ع�����Ա�������ղ����������б�Ϊnull
	Method getDeclaredMethod(String name,parameterTypes):�������г�Ա������
	Method[] getMethods()����ȡ����͸����еĹ���������
	Method[] getDeclaredMethods()����ȡ�����а���˽�С�
	Object invoke(Object obj ,����)�����÷�������������Ǿ�̬���������Ϊnull��
	�磺
	һ�㷽ʽ��str.charAt(1);
	���䷽ʽ��p.invoke(str,1);����һ������Ϊnull������Method������Ӧ����һ����̬������
 */
public class ReflectMethod {

	public static void main(String[] args) throws Exception{
		Class clazz =Class.forName("reflect.Person");
//		myMethod(clazz);
//		myMethod1(clazz);
//		myMethod2(clazz);
//		myMethod3(clazz);
		myMethod4(clazz);
	}
	//��ȡ������̬����
	private static void myMethod(Class clazz) throws Exception {
//		Person p = (Person)clazz.newInstance();
		Method m = clazz.getMethod("show");
		m.invoke(null,null);//��һ��null�����Ǿ�̬�������ڶ���null�������������б�Ϊ��
	}
	private static void myMethod1(Class clazz) throws Exception{
		Constructor con = clazz.getDeclaredConstructor(String.class,int.class);
		con.setAccessible(true);
		Object obj = con.newInstance("zhangsn",27);
		
		Method m = clazz.getMethod("setAge",int.class);
		m.invoke(obj,28);
		Method m2 = clazz.getMethod("getAge",null);
		Object o2 = m2.invoke(obj,null);
		System.out.println(o2);
	}
	//��ȡ���ַ���ֵ
	private static void myMethod2(Class clazz) throws Exception{
		Person p = (Person)clazz.newInstance();
		Method m = clazz.getDeclaredMethod("setName",String.class);
		m.setAccessible(true);
		Object o = m.invoke(p,"����ϼ");

		Method m2 = clazz.getDeclaredMethod("getName");
		m2.setAccessible(true);
		Object o2 = m2.invoke(p);
		String s = (String)o2;
		System.out.println(s);
	}
	//��ȡ����͸����еĹ���������
	private static void myMethod3(Class clazz) {
		Method[] mes = clazz.getMethods();
		for(Method m : mes){
			System.out.println(m);
		}
	}

	private static void myMethod4(Class clazz) {
		Method[] mes = clazz.getDeclaredMethods();
		for(Method m : mes){
			System.out.println(m);
		}
	}

}
