package properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 *这里的集合必须是Properties集合：
 * public void load(Reader reader):把文件中的数据读取到集合中
 * public void store(Writer writer,String comments):把集合中的数据存储到文件
 */
public class LoadStore {

	public static void main(String[] args) throws IOException {
//		myLoad();
		myStore();
	}

	private static void myStore() throws IOException {
		Properties p = new Properties();
		p.setProperty("林青霞","27");
		p.setProperty("林志颖","45");
		p.setProperty("林志炫","45");
		
		Writer w = new FileWriter("F:\\s.txt");
		p.store(w,"lover");
		w.close();
	}

	private static void myLoad() throws IOException {
		Properties p = new Properties();
		//读取文本用字符流，否则无法识别
//		InputStream is = new FileInputStream("F:\\s.txt");
		
		Reader r = new FileReader("F:\\s.txt");
		p.load(r);
		
		r.close();
		Set<String> spn = p.stringPropertyNames();
		for(String s : spn){
			String value = p.getProperty(s);
			System.out.println(s+":"+value);
		}
	}
	
}
