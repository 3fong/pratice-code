package io.charStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/*
 *��ϰ��ģ��BufferedReader��
	˼·������read�������Ի��з�Ϊ��ǽ������ж�ȡ��
 */
class MyBufferedReader {
	private Reader r;
	MyBufferedReader(Reader r){
		this.r=r;
	}
	public String myRead() throws IOException{
		StringBuilder sb = new StringBuilder();
		int len=0;
		while((len=r.read())!=-1){
			if(len=='\r')
				continue;
			if(len=='\n')
				return sb.toString();
			else
				sb.append((char)len);//ע��Ҫ�洢�ַ��������ֽ�
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void myClose()throws IOException{
		r.close();
	}
}
public class MyBufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		MyBufferedReader mbr = new MyBufferedReader(new FileReader("F:\\z.txt"));
		String line=null;
		while((line=mbr.myRead())!=null){
			System.out.println(line);
		}
	}

}
