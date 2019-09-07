package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 *BufferedReader
 * 		|--LineNumberReader
 * 			public int getLineNumber()��õ�ǰ�кš� 
 * 			public void setLineNumber(int lineNumber)
 */
public class LineNumReader {

	public static void main(String[] args) throws IOException {
		LineNumberReader lr = new LineNumberReader(new FileReader("F:\\a.txt"));
		
		//δ����ʱ�к�Ϊ0
		System.out.println(lr.getLineNumber());
		System.out.println(lr.getLineNumber());
		System.out.println(lr.getLineNumber());
		String line = null;
		lr.setLineNumber(10);
		while((line=lr.readLine())!=null){
			System.out.println(lr.getLineNumber()+":"+line);
		}
		lr.close();
	}

}
