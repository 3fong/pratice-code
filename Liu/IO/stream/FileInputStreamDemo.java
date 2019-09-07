package stream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *读取数据的方式：
 * A:int read():一次读取一个字节
 * B:int read(byte[] b):一次读取一个字节数组
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("java.txt");
		
//		int by=0;
//		
//		//-1是read()读取结束标记。
//		while((by=fis.read())!=-1){
//			//直接输出的是字节表示形式，要是字符内容的话，要进行转换
//			System.out.println((char)by);
//		}
		
		//数组的长度一般是1024或者1024的整数倍
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=fis.read(bytes))!=-1){
			
			//涉及数组转字符串
			System.out.println(new String(bytes,0,len));
		}
		fis.close();
	}

}
