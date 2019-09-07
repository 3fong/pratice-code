package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args)throws IOException {
		 printFile();
	}
	public static void printFile()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw = new PrintWriter(new FileWriter("print.txt"),true);
		
		String line = null;
		while((line=br.readLine())!=null){
			if("over".equals(line))
				break;
			pw.println(line.toUpperCase());			
		}
		br.close();
		pw.close();
	}
}
