package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *需求：把e:\\哥有老婆.mp4复制到当前项目目录下的copy.mp4中
 * 
 * 字节流四种方式复制文件：
 * 基本字节流一次读写一个字节：	共耗时：47732毫秒
 * 基本字节流一次读写一个字节数组： 共耗时：77毫秒
 * 高效字节流一次读写一个字节： 共耗时：482毫秒
 * 高效字节流一次读写一个字节数组：共耗时：37毫秒
 */
public class CopyMp4 {

	public static void main(String[] args) throws IOException {
		long start =System.currentTimeMillis();
		show4();
		long end = System.currentTimeMillis();
		
		System.out.println("共耗时："+(end-start)+"毫秒");
	}
	//基本字节流读写一个自己
	public static void show1() throws IOException{
		FileInputStream fis = 
				new FileInputStream("C:\\Users\\David\\Desktop\\01天-05-Java环境搭建(环境变量配置技巧).avi");
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\David\\Desktop\\a.avi");
		
		int len=0;
		while((len=fis.read())!=-1){
			fos.write(len);
		}
		fis.close();
		fos.close();
	}
	//基本字节流读写一个数组
	public static void show2() throws IOException{
		FileInputStream fis = 
				new FileInputStream("C:\\Users\\David\\Desktop\\01天-05-Java环境搭建(环境变量配置技巧).avi");
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\David\\Desktop\\a.avi");
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=fis.read(bytes))!=-1){
			fos.write(bytes,0,len);
		}
		fis.close();
		fos.close();
	}
	//加入缓冲区读写一个字节
	public static void show3() throws IOException{
		FileInputStream fis = 
				new FileInputStream("C:\\Users\\David\\Desktop\\01天-05-Java环境搭建(环境变量配置技巧).avi");
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\David\\Desktop\\a.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int len=0;
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
	//加入缓冲区读写一个数组
	public static void show4() throws IOException{
		FileInputStream fis = 
				new FileInputStream("C:\\Users\\David\\Desktop\\01天-05-Java环境搭建(环境变量配置技巧).avi");
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\David\\Desktop\\a.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=bis.read(bytes))!=-1){
			bos.write(bytes,0,len);
		}
		bis.close();
		bos.close();
	}
}
