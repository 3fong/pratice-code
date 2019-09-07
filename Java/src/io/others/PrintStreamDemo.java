package io.others;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

/*
 * ��ӡ��ֻ����������ַ��ӡ�����ֽڴ�ӡ���Ľ��ն����һ���ֽ�����
 *PrintStream PrintWriter
 */
public class PrintStreamDemo {

	public static void main(String[] args) throws IOException{
		PrintStream ps = new PrintStream(new FileOutputStream("F:\\p.txt"));
		ps.print(97);//97
		ps.write(97);//a
		ps.close();
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter(OutputStream out, boolean autoFlush)
		PrintWriter pw = new PrintWriter(System.out,true);	
		String line=null;
		while((line=br.readLine())!=null){
			if(line.equals("over"))
				break;
//			pw.write(line);
//			pw.flush();
			pw.println(line);
		}
	}
}
