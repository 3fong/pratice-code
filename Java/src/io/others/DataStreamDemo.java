package io.others;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *1��������������ͣ�
	�����������DataInputStream(InputStream in)
	����������DataOutputStream��OutputStream out)
	��ط�����
	writeUTF(String str)����������޹ط�ʽʹ��UTF-8�޸İ���뽫һ���ַ�д����������
	��ζ�ţ�ֻ��ͨ���Ӧ�ķ�����ȡ��ݣ���ת��������������
	readUTF(String str):ר�����ڶ�ȡUTF-8�޸İ���롣
 */
public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream("F:\\abc.txt"));
		DataInputStream dis =
				new DataInputStream(new FileInputStream("F:\\abc.txt"));
//		myOut(dos);
//		myIn(dis);
		myOutUTF(dos);
		myInUTF(dis);
	}

	private static void myInUTF(DataInputStream dis) throws IOException{
		String s = dis.readUTF();
		System.out.println(s);
		dis.close();
	}

	private static void myOutUTF(DataOutputStream dos) throws IOException{
		dos.writeUTF("����й�");
		dos.close();
	}

	private static void myIn(DataInputStream dis) throws IOException{
		short s = dis.readShort();
		boolean b = dis.readBoolean();
		char c = dis.readChar();
		System.out.println(s+"::"+b+"::"+c);
		dis.close();
	}

	private static void myOut(DataOutputStream dos) throws IOException {
		dos.writeShort(45);
		dos.writeBoolean(false);
		dos.writeChars("fafa");
		dos.close();
	}	
}
