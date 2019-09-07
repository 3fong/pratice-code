package io;

import java.io.FileReader;
import java.io.IOException;

public class ReadType {

	public static void main(String[] args)throws IOException {
		FileReader fr = new FileReader("D:\\demo.txt");
		type1(fr);
		fr.close();	
	}
	public static void type1(FileReader fr)throws IOException{		
		int ch=0;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}
	}
	public static void type2(FileReader fr)throws IOException{
		char[] chs = new char[1024];
		
		int num=0;
		while((num=fr.read(chs))!=-1){
			//将数组变成字符串。read(int[] arr)返回数组中元素个数
			System.out.print(new String(chs,0,num));
		}
	}
}
