package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *测试自定义行号缓冲区LineNumberReader
 */
public class MyLineNumDemo {

	public static void main(String[] args) throws IOException {
		show1();
	}
	public static void show() throws IOException{
		MyLineNumReader mr =new MyLineNumReader(new FileReader("F:\\a.txt"));
		
		System.out.println(mr.getNum());
		System.out.println(mr.getNum());
		System.out.println(mr.getNum());
		
		mr.setNum(15);
		String line=null;
		while((line=mr.MyRead())!=null){
			System.out.println(mr.getNum()+":"+line);
		}		
	}
	public static void show1() throws IOException{
		MyLineNumReader2 mr2 =new MyLineNumReader2(new FileReader("F:\\a.txt"));
		
		System.out.println(mr2.getNum());
		System.out.println(mr2.getNum());
		System.out.println(mr2.getNum());
		
		mr2.setNum(15);
		String line2=null;
		while((line2=mr2.Myread())!=null){
			System.out.println(mr2.getNum()+":"+line2);
		}		
	}
}
