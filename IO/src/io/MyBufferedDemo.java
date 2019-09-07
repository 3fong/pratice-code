package io;

import java.io.FileReader;
import java.io.IOException;

/*
 * 根据缓冲区readLine换行原理，自定义一个缓冲区。
 * 缓冲区的读取方式是基于字符流读取方式，并予以增强。这就是装饰设计模式。
 */
class MyBuffer{
	private FileReader fr;
	MyBuffer(FileReader fr){
		this.fr=fr;
	}
	public String myReadLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		
		int len=0;
		while((len=fr.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n')
				return sb.toString();
			else
				sb.append((char)len);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void myClose() throws IOException{
		fr.close();
	}
}
public class MyBufferedDemo {

	public static void main(String[] args) throws IOException {
		MyBuffer mb = new MyBuffer(new FileReader("buf.txt"));
		
		String line=null;
		while((line=mb.myReadLine())!=null){
			System.out.println(line);
		}
		mb.myClose();
	}
}
