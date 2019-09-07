package io.others;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 *3.1 ���룺
	String-->byte[];  
	byte[] getBytes(String charsetName):ʹ��ָ�����ַ���String����Ϊ�ֽ����У����洢�������С�
3.2 ���룺
	byte[]-->String;  
	String(byte[],charsetName)�����������ַ�
	
	IO���еı�������
	A:OutputStreamWriter
		OutputStreamWriter(OutputStream os):Ĭ�ϱ��룬GBK
		OutputStreamWriter(OutputStream os,String charsetName):ָ�����롣
	B:InputStreamReader
		InputStreamReader(InputStream is):Ĭ�ϱ��룬GBK
		InputStreamReader(InputStream is,String charsetName):ָ������
	C:����������ʵ�ܼ�
			����ֻҪһ�¼���
 */
public class EncodeDemo {

	public static void main(String[] args) throws IOException{
		myEncode();
		myOut();
		myIn();
	}

	private static void myIn() throws IOException{
		InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\utf.txt"),"UTF-8");
		char[] chs = new char[10];
		int len = isr.read(chs);
		System.out.println(new String(chs,0,len));
		isr.close();
	}

	private static void myOut() throws IOException{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\utf.txt"),"UTF-8");
		osw.write("���");
		osw.close();
	}

	private static void myEncode() throws IOException {
		String s = "���";
		//����
		byte[] bys = s.getBytes();
		sop(Arrays.toString(bys));
		//����
		String st = new String(bys,"GBK");
		sop(st);
	}
	private static void sop(Object obj){
		System.out.println(obj);
	}
}
