package properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 *我有一个文本文件(user.txt)，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有“林志炫”这样的键存在，如果有就改变其实为”100”
 * 分析：	
 * 		键值对形式，用properties加载
 * 		判断元素是否存在，用遍历
 * 		改值用setProperties
 * 		用store方法保存数据
 */
public class ChangeFile {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		
		Reader r = new FileReader("F:\\s.txt");
		p.load(r);
		r.close();
		
		Set<String> spn = p.stringPropertyNames();
		for(String s : spn){
			if(s.equals("林志炫")){
				p.setProperty(s,"100");
				break;
			}
		}
		Writer w = new FileWriter("F:\\s.txt");
		p.store(w,"修改版");
		w.close();
	}

}
