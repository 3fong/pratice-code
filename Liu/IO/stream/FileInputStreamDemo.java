package stream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 *��ȡ���ݵķ�ʽ��
 * A:int read():һ�ζ�ȡһ���ֽ�
 * B:int read(byte[] b):һ�ζ�ȡһ���ֽ�����
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("java.txt");
		
//		int by=0;
//		
//		//-1��read()��ȡ������ǡ�
//		while((by=fis.read())!=-1){
//			//ֱ����������ֽڱ�ʾ��ʽ��Ҫ���ַ����ݵĻ���Ҫ����ת��
//			System.out.println((char)by);
//		}
		
		//����ĳ���һ����1024����1024��������
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=fis.read(bytes))!=-1){
			
			//�漰����ת�ַ���
			System.out.println(new String(bytes,0,len));
		}
		fis.close();
	}

}
