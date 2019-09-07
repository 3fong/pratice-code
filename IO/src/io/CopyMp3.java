package io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * �Զ����ֽ�������������ý���ļ����ؼ������ݵ�����������ǿ��
 * �ֽ���������ԭ��ÿ�ζ�ȡ�̶�����ֵ�������ٴ�ȡֵ��ȡ��
 * ˼·��
 * 1 �������顣��ȡ����
 * 2 ����ָ�롣��¼ÿ�ζ�ȡ���ݵ�λ�á�
 * 3 ����������¼���鱻��ȡ�ĸ�������ȷ���Ƿ����¶���ֵ��
 */

class MyBuffered{
	private InputStream in;
	private byte[] buf = new byte[1024];
	private int pos,count;
	MyBuffered(InputStream in){
		this.in=in;
	}
	public int myRead()throws IOException{
		if(count==0){
			count = in.read(buf);
			if(count<0)
				return -1;
			pos=0;
			byte b = buf[pos];
			
			count--;
			pos++;
			return b&0xff;
		}
		if(count>0){
			byte b = buf[pos];
			count--;
			pos++;
			return b&0xff;
		}
		return -1;
	}
	public void myClose() throws IOException{
		in.close();
	}
}
public class CopyMp3 {

	public static void main(String[] args)throws IOException {
		long start = System.currentTimeMillis();
		copy1();
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)+"����");
	}
	public static void copy1()throws IOException{
		MyBuffered mb= new MyBuffered(new FileInputStream("D:\\copy.mp3"));
		BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("F:\\1.mp3"));
		
		int len=0;
//		System.out.println("��һ���ֽڣ�"+mb.myRead());
		while((len=mb.myRead())!=-1){
			//д��ʱ������������ǿת��
			bf.write(len);
		}
		mb.myClose();
		bf.close();		
	}
}
