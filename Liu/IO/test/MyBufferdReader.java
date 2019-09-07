package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *测试自定义缓冲区的换行方法
 */
public class MyBufferdReader {

	public static void main(String[] args) throws IOException {
		MyBufferedReader mr = new MyBufferedReader(new FileReader("F:\\a.txt"));
		
		String line=null;
		while((line=mr.Myread())!=null){
			System.out.println(line);
		}
		mr.close();
	}

}
