package chars;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter�ķ�����
 * public void write(int c):дһ���ַ�
 * public void write(char[] cbuf):дһ���ַ�����
 * public void write(char[] cbuf,int off,int len):дһ���ַ������һ����,len�Ǹ���
 * public void write(String str):дһ���ַ���
 * public void write(String str,int off,int len):дһ���ַ�����һ����
 * 
 *  �����⣺close()��flush()������?
 * A:close()�ر������󣬵�����ˢ��һ�λ��������ر�֮�������󲻿��Լ�����ʹ���ˡ�
 * B:flush()����ˢ�»�����,ˢ��֮�������󻹿��Լ���ʹ�á�
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\a.txt"));
		
		//���ݴ洢���ֽ�Ϊ������λ����Ҫ�洢�ַ�����Ҫˢ��  �ַ�=2�ֽڡ�
		osw.write(97);//a
		osw.flush();
		
		char[] chs = {'a','b','c','d'};
		osw.write(chs);
		osw.flush();
		
		osw.write(chs,1,2);
		osw.flush();
		
		osw.write("�氮����");
		
		osw.write("���ǰ�˭˭",2,3);
		osw.flush();
		osw.close();
	}

}
