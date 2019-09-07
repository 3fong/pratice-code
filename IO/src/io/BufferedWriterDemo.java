package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException{
		myWrite();
		myReader();
	}
	public static void myWrite()throws IOException{
		BufferedWriter bw = 
				new BufferedWriter(new FileWriter("buf.txt"));
		for(int x=0;x<5;x++){
			bw.write("afafa"+x);
			bw.newLine();
			bw.flush();
		}
		bw.close();	
	}
	public static void myReader()throws IOException{
		BufferedReader br =
				new BufferedReader(new FileReader("buf.txt"));
		String line = null;
		//readLine()：读取到末尾时会返回null。
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
