package io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 自定义字节流缓冲区复制媒体文件。关键：数据的类型提升和强制
 * 字节流缓冲区原理：每次读取固定长度值，读完再次取值读取。
 * 思路：
 * 1 定义数组。读取数据
 * 2 定义指针。记录每次读取数据的位置。
 * 3 计数器。记录数组被读取的个数。以确定是否重新读入值。
 */

class MyBuffered{
	private InputStream in;
	private byte[] buf = new byte[1024];
	private int pos,count;
	MyBuffered(InputStream in){
		this.in=in;
	}
	public int myRead()throws IOException{
		if(count==0){
			count = in.read(buf);
			if(count<0)
				return -1;
			pos=0;
			byte b = buf[pos];
			
			count--;
			pos++;
			return b&0xff;
		}
		if(count>0){
			byte b = buf[pos];
			count--;
			pos++;
			return b&0xff;
		}
		return -1;
	}
	public void myClose() throws IOException{
		in.close();
	}
}
public class CopyMp3 {

	public static void main(String[] args)throws IOException {
		long start = System.currentTimeMillis();
		copy1();
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)+"毫秒");
	}
	public static void copy1()throws IOException{
		MyBuffered mb= new MyBuffered(new FileInputStream("D:\\copy.mp3"));
		BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("F:\\1.mp3"));
		
		int len=0;
//		System.out.println("第一个字节："+mb.myRead());
		while((len=mb.myRead())!=-1){
			//写出时将提升的类型强转。
			bf.write(len);
		}
		mb.myClose();
		bf.close();		
	}
}
