package test33;

import java.lang.reflect.Method;

/*
 *��дһ���࣬����һ��ʵ���������ڴ�ӡһ���ַ�����
 * ��ʹ�÷����ֶδ�������Ķ��� �����øö����еķ�����
 */
class PrintStr{
	public void printStr(String str){
		System.out.println(str);
	}
}
public class T18ReflectMethodDemo {
	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("test33.PrintStr");
		Object obj = clazz.newInstance();
		
		Method me = clazz.getMethod("printStr",String.class);
		me.invoke(obj,"���ͣ�С�����");
	}

}
