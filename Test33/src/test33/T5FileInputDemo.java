package test33;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 *5 ����һ���ļ�������������read(byte[] b)������exercise.txt
 * �ļ��е��������ݴ�ӡ����(byte����Ĵ�С����Ϊ5)��
	������
		byte[]˵��Ҫʹ���ֽ����������СΪ5��������ӡ�϶����У���ʱ�������ڴ�����
			ByteArrayInputStream
			ByteArrayOutputStream
			������ʱ���ݴ洢���洢��ֱ�ӷ������ݾͿ���
 */
public class T5FileInputDemo {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\stu.txt");
		
		String s = readFile(file);
		System.out.println(s);
	}

	private static String readFile(File file) throws IOException{
		FileInputStream fis = new FileInputStream(file);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] bys = new byte[5];
		int len=0;
		while((len=fis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		fis.close();
		return bos.toString();
	}
}
