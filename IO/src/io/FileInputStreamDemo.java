package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//字节流的三种读取方式
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		writeFile();
		FileInputStream fi = new FileInputStream("fo.txt");
//		read1(fi);
//		read2(fi);
		read3(fi);
		fi.close();
	}
	public static void writeFile()throws IOException{
		FileOutputStream fo = new FileOutputStream("fo.txt");
		fo.write("abflafj".getBytes());
		fo.close();
	}
	public static void read1(FileInputStream fi)throws IOException{
		int len=0;
		while((len=fi.read())!=-1){
			System.out.println((char)len);
		}
	}
	public static void read2(FileInputStream fi)throws IOException{
		byte[] chs = new byte[1024];
		int len=0;
		while((len=fi.read(chs))!=-1){
			System.out.println(new String(chs,0,len));
		}
	}
	public static void read3(FileInputStream fi)throws IOException{
		byte[] chs = new byte[fi.available()];
		fi.read(chs);
		System.out.println(new String(chs));
	}
}
