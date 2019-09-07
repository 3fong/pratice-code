package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
//在屏幕行输出字符，根据over结束。注意转换流的应用。
public class ReadIn {

	public static void main(String[] args) throws IOException {
		readIn3();
	}
	//第一种方法
	public static void readIn()throws IOException{
		InputStream is = System.in;
		StringBuilder sb = new StringBuilder();
		
		while(true){
			int len = is.read();
			if(len=='\r')
				continue;
			if(len=='\n'){
				String s = sb.toString();
				if("over".equals(s))
					break;
				System.out.println(s.toUpperCase());
				sb.delete(0,sb.length());
			}
			else
				sb.append((char)len);
		}
		is.close();		
	}
	public static void readIn2() throws IOException{
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String line=null;
		while((line=br.readLine())!=null){
			if("over".equals(line))
				break;
			System.out.println(line.toUpperCase());
		}
		br.close();
	}
	//转换流
	public static void readIn3() throws IOException{
		System.setIn(new FileInputStream("D:\\Work\\IO\\hello.java"));
		System.setOut(new PrintStream("F:\\z.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = null;
		while((line=br.readLine())!=null){
			if("over".equals(line))
				break;
			bw.write(line.toUpperCase());
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
