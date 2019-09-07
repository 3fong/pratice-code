package chars;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 *需求：把ArrayList集合中的字符串数据存储到文本文件
 *分析：
 *		数据是字符串，存储到文本文件，只用到字符输出流
 */
public class ListToFileDemo {

	public static void main(String[] args) throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\c.txt"));
		
		al.add("林青霞");
		al.add("王祖贤");
		al.add("张敏");
		al.add("贾静雯");
		al.add("李师师");
		
		for(String s : al){
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
