package io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *a �ֽ�������������ַ�������ͬ����������Բ����ַ����Բ�������ý���ļ���
	b ����ý���ļ���ݶ������ֽڴ洢�ģ������ֽ�������ɶ�дý���ļ������ý���ˢ�¶�����
	c �ֽ������ࣺInputStream��������OutputStream��д��
	��4�ֶ�д��ʽ
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws IOException {
		File src = new File("F:\\a.avi");
		File aim = new File("F:\\copy4.avi");
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(aim);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		long start = System.currentTimeMillis();
//		myRead1(fis,fos);//����ʱ:38767
//		myRead2(fis,fos);//����ʱ:53
//		myRead3(bis,bos);//����ʱ:467
		myRead4(bis,bos);//����ʱ:23
		long end = System.currentTimeMillis();
		System.out.println("����ʱ:"+(end-start));
	}

	private static void myRead1(FileInputStream fis, FileOutputStream fos) throws IOException{
		int len=0;
		while((len=fis.read())!=-1){
			fos.write(len);
		}
		fis.close();
		fos.close();
	}
	private static void myRead2(FileInputStream fis, FileOutputStream fos) throws IOException{
		byte[] bys = new byte[1024];
		int len=0;
		while((len=fis.read(bys))!=-1){
			fos.write(bys,0,len);
		}
		fis.close();
		fos.close();
	}

	private static void myRead3(BufferedInputStream bis, BufferedOutputStream bos) throws IOException{
		int len=0;
		while((len=bis.read())!=-1){
			bos.write(len);
		}
		bis.close();
		bos.close();
	}

	private static void myRead4(BufferedInputStream bis, BufferedOutputStream bos) throws IOException{
		byte[] bys = new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		bis.close();
		bos.close();
	}
}
