package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

//LineNumberReader是BufferedReader的子类，所以使用方法跟父类一样。
public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		LineNumberReader ln = new LineNumberReader(new FileReader("buf.txt"));
		
		String line = null;
		ln.setLineNumber(10);
		while((line=ln.readLine())!=null){
			System.out.println(ln.getLineNumber()+":"+line);
		}
		ln.close();
	}

}
