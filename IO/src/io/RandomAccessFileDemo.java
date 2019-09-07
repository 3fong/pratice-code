package io;

import java.io.RandomAccessFile;

//随机访问文件。
public class RandomAccessFileDemo {

	public static void main(String[] args)throws Exception {
		writeFile();
//		readFile();
	}
	public static void readFile()throws Exception{
		RandomAccessFile ra = new RandomAccessFile("raf.txt","r");
		
//		ra.seek(16);
		ra.skipBytes(16);
		byte[] buf = new byte[4];
		ra.read(buf);
		String name = new String(buf);
		int age = ra.readInt();
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		ra.close();
	}
	public static void writeFile()throws Exception{
		RandomAccessFile ra = new RandomAccessFile("raf.txt","rw");
				
		ra.write("王五".getBytes());
		ra.writeInt(258);
		ra.write("王六".getBytes());
		ra.writeInt(103);
		ra.write("王七".getBytes());
		ra.writeInt(259);
		
		ra.close();
	}
}
