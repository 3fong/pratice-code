package io.charStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 *LineNumberReader�������кŵĻ����ַ���������LineNumberReader��BufferedReader�����ࡣ
      ���ඨ���˷���setLineNumber(int)��getLineNumber(),���ǿɷֱ��������úͻ�ȡ��ǰ�кš�
 */
public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException{
		LineNumberReader lnr = 
				new LineNumberReader(new FileReader("F:\\z.txt"));
		
		String line=null;
		lnr.setLineNumber(444);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+line);
		}
	}

}
