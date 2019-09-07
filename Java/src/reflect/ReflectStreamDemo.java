package reflect;

import java.io.FileReader;
import java.util.Collection;
import java.util.Properties;

/*
 *
 */
public class ReflectStreamDemo {

	public static void main(String[] args) throws Exception {
		//用流导入配置文件
		FileReader fr = new FileReader("D:\\Work\\Java\\reflect\\reflect\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		fr.close();
		String value = p.getProperty("className");
		Class clazz = Class.forName(value);
		Object obj = clazz.newInstance();
		Collection col = (Collection)obj;
		
		col.add(new Student("hua",27));
		col.add(new Student("hua",27));
		col.add(new Student("mu",22));
		col.add(new Student("lan",23));
		System.out.println(col.size());
		for(Object o : col){
			Student s = (Student)o;
			System.out.println(s.getName()+":"+s.getAge());
		}
	}
}
