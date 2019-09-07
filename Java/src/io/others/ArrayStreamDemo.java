package io.others;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 *�ڴ�����������ڴ�����ʱ�洢��Ϣ�����������ݾʹ��ڴ�����ʧ��
	�ֽ����飺
		ByteArrayInputStream
		ByteArrayOutputStream
	�ַ����飺
		CharArrayReader
		CharArrayWriter
	�ַ�
		StringReader
		StringWriter
	�ص㣺
	������������ݵĲ���д����Զ�������
	δʹ��ϵͳ��Դ�����ý���close�رա�
	�ŵ㣺�����˶���ķ�װ�ԣ�����ĸ����ԣ������Ķ�д˼�����������飬������д��

 */
public class ArrayStreamDemo {
	public static void main(String[] args) throws IOException{
		byteStream();
	}
	public static void byteStream() throws IOException{
		ByteArrayInputStream bai = new ByteArrayInputStream("afkal".getBytes());
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		int len=0;
		while((len=bai.read())!=-1){
			bao.write(len);
			bao.flush();
		}
		System.out.println(bao.size());
		System.out.println(bao.toString());
	}
}
