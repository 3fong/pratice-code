package randomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 *�����������
 * 		RandomAccessFile�಻����������Object������ࡣ
 * 		�����ں���InputStream��OutputStream�Ĺ��ܡ�
 * 		֧�ֶ��ļ���������ʶ�ȡ��д�롣
 * public RandomAccessFile(String name,String mode)����һ���������ļ�·�����ڶ��������ǲ����ļ���ģʽ��
 * 		ģʽ�����֣�������õ�һ�ֽ�"rw",���ַ�ʽ��ʾ�Ҽȿ���д���ݣ�Ҳ���Զ�ȡ���� 
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		showWrite();
		showReader();
	}
	public static void showWrite() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("F:\\a.txt","rw");
		
		raf.writeLong(4512);
		raf.writeChar('a');
		raf.writeUTF("����");
		
		raf.close();
	}
	public static void showReader() throws IOException{
		RandomAccessFile raf = 
				new RandomAccessFile("F:\\a.txt","rw");
		
		long l = raf.readLong();
//		System.out.println("��ǰָ���ǣ�"+raf.getFilePointer());//8
		char c = raf.readChar();
		System.out.println("��ǰָ���ǣ�"+raf.getFilePointer());
		String s = raf.readUTF();
		System.out.println(l+":"+c+":"+s);
		
		raf.seek(10);
		s = raf.readUTF();//��ȡ����ϢҪ��seek�������һ��
		System.out.println(s);
		raf.close();
	}
}
