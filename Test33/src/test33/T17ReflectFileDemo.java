package test33;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 *(1) дһ��Properties��ʽ�������ļ�����������������ơ�
  (2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ����������,
	�÷��� �ķ�ʽ����run������
 */
class Person{
	public void run(){
		System.out.println("run......");
	}
}
public class T17ReflectFileDemo {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader(
				"D:\\Work\\Test33\\src\\test33\\properties.ini");
		Properties p = new Properties();
		p.load(fr);
		fr.close();
		
		String className= p.getProperty("className");
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance();
		
		Method me = clazz.getMethod("run");
		me.invoke(obj);
	}

}
