package io.others;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 *RandomAccessFile:�������ļ�������߱���д��������ֱ�Ӽ̳���Object��������IO��ϵ�����ࡣ
RandomAccessFile(String name,String mode)����һ���������ļ�·�����ڶ��������ǲ����ļ���ģʽ��
	1���ص㣺
	1.1 �߱�����д���ܣ�
	1.2 �ö����ڲ���װ��һ��byte���飬��ͨ��ָ����Բ��������е�Ԫ�أ�
	1.3 ����ͨ��getFilePointer������ȡָ��λ�ã�ͨ��seek�����ı�ָ��λ�á�
	1.4 �ö���ֻ�ܲ����ļ������Ҳ����ļ�����ģʽ��ֻ����r����д��rw��
	2�����÷�����
	skipBytes()���ָ�����ֽ���; 
	seek()���������ָ��;
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException{
		readFile();
//		writeFile();
	}

	private static void writeFile() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("F:\\raf.txt","rw");
		raf.write(257);//��ȡһ���ֽڣ�����255�ʹ�����ݶ�ʧ��
		raf.writeInt(257);
		raf.write("wnagwu".getBytes());
		
		raf.seek(2*8);//��ָ��λ��д�����
		raf.write("����".getBytes());
		raf.writeInt(20);
		raf.close();
	}

	private static void readFile() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("F:\\raf.txt","r");
		int len = raf.read();
		int len2 = raf.readInt();
		int len3 = raf.read();
		System.out.println(len+":"+len2+":"+len3);
		
//		raf.skipBytes(16);//���ָ�����ֽ����ܻ���
		raf.seek(16);//ͨ��seek��������λ�á�
		byte[] bys = new byte[4];
		raf.read(bys);
		
		String name=new String(bys);
		int age = raf.readInt();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		raf.close();
	}

}
