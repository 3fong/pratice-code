package test;

import java.lang.reflect.Method;

/*
 *4.�÷��佫��˽�����εķ�����ȡ����
 */
public class ReflectDemo {

	public static void main(String[] args) {
		try {
			//��ȡ����ֽ����ļ��ʹ���ʵ��
			Class clazz = Class.forName("test.Person");
			Object obj = clazz.newInstance();
			
			//��Ϊ����˽�з�����������Ҫͨ���������ʻ�ȡ����Ȩ��
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
