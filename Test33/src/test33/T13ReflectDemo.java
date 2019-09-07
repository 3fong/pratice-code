package test33;

import java.lang.reflect.Method;

/*
 *��Ŀ����дһ���࣬����һ��ʵ���������ڴ�ӡһ���ַ�����
 * ��ʹ�÷����ֶδ�������Ķ��� �����øö����еķ���
 */
class PrintString{
	private void show(){
		System.out.println("I am a String");
	}
}
public class T13ReflectDemo {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("test33.PrintString");
		Object obj = clazz.newInstance();
		Method me = clazz.getDeclaredMethod("show",null);
		me.setAccessible(true);
		me.invoke(obj,null);
	}

}
