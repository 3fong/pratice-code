package test2;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 *反射需和配置文件配合使用
 */
public class Test {

	public static void main(String[] args) throws Exception{
		Worker w = new Worker();
		w.love();
		
//		Class c = Class.forName("test.Worker");
//		Constructor con = c.getConstructor();
//		Object obj = con.newInstance();
//		
//		Method md = c.getMethod("love");
//		md.invoke(obj);
		
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		Class c = Class.forName(className);
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		Method m = c.getMethod(methodName);
		m.invoke(obj);
	}

}
