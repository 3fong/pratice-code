package chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 *需求：从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
 *分析：
 *		从文本文件中读取，用字符读取流，可加入缓冲区
 *		存入集合，不涉及键值对，所以用Collection，要是保证数据唯一性可选择set
 */
public class OutputToList {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("F:\\c.txt"));
		ArrayList<String> al = new ArrayList<String>();
		
		String line=null;
		while((line=br.readLine())!=null){
			al.add(line);
		}
		br.close();
		
		for(String s : al){
			System.out.println(s);
		}
	}

}
