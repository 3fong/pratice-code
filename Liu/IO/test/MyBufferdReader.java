package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *�����Զ��建�����Ļ��з���
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
