package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *���󣺰�e:\\��������.mp4���Ƶ���ǰ��ĿĿ¼�µ�copy.mp4��
 * 
 * �ֽ������ַ�ʽ�����ļ���
 * �����ֽ���һ�ζ�дһ���ֽڣ�	����ʱ��47732����
 * �����ֽ���һ�ζ�дһ���ֽ����飺 ����ʱ��77����
 * ��Ч�ֽ���һ�ζ�дһ���ֽڣ� ����ʱ��482����
 * ��Ч�ֽ���һ�ζ�дһ���ֽ����飺����ʱ��37����
 */
public class CopyMp4 {

	public static void main(String[] args) throws IOException {
		long start =System.currentTimeMillis();
		show4();
		long end = System.currentTimeMillis();
		
		System.out.println("����ʱ��"+(end-start)+"����");
	}
	//�����ֽ�����дһ���Լ�
	public static void show1() throws IOException{
		FileInputStream fis = 
				new FileInputStream("C:\\Users\\David\\Desktop\\01��-05-Java�����(�����������ü���).avi");
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\David\\Desktop\\a.avi");
		
		int len=0;
		while((len=fis.read())!=-1){
			fos.write(len);
		}
		fis.close();
		fos.close();
	}
	//�����ֽ�����дһ������
	public static void show2() throws IOException{
		FileInputStream fis = 
				new FileInputStream("C:\\Users\\David\\Desktop\\01��-05-Java�����(�����������ü���).avi");
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\David\\Desktop\\a.avi");
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=fis.read(bytes))!=-1){
			fos.write(bytes,0,len);
		}
		fis.close();
		fos.close();
	}
	//���뻺������дһ���ֽ�
	public static void show3() throws IOException{
		FileInputStream fis = 
				new FileInputStream("C:\\Users\\David\\Desktop\\01��-05-Java�����(�����������ü���).avi");
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\David\\Desktop\\a.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int len=0;
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		bis.close();
		bos.close();
	}
	//���뻺������дһ������
	public static void show4() throws IOException{
		FileInputStream fis = 
				new FileInputStream("C:\\Users\\David\\Desktop\\01��-05-Java�����(�����������ü���).avi");
		FileOutputStream fos = 
				new FileOutputStream("C:\\Users\\David\\Desktop\\a.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=bis.read(bytes))!=-1){
			bos.write(bytes,0,len);
		}
		bis.close();
		bos.close();
	}
}
