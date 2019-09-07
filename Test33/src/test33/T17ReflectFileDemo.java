package test33;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 *(1) 写一个Properties格式的配置文件，配置类的完整名称。
  (2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类,
	用反射 的方式运行run方法。
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
