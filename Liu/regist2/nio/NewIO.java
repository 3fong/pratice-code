package nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 *JDK7��֮���nio��
 * Path:·��
 * Paths:��һ����̬��������һ��·��
 * 		public static Path get(URI uri)
 * Files:�ṩ�˾�̬����������ʹ��
 * 		public static long copy(Path source,OutputStream out):�����ļ�
 * 		public static Path write(Path path,Iterable<? extends CharSequence> lines,
 * 													Charset cs,OpenOption... options)
 */
public class NewIO {

	public static void main(String[] args) throws IOException {
//		myCopy();
		myWrite();
	}

	private static void myWrite() throws IOException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("java");
		al.add("wrold");
		//Ŀ�ĵأ�
		Files.write(Paths.get("F:\\al.txt"),al,Charset.forName("GBK"));
	}
	private static void myCopy() throws IOException {
		//public static long copy(Path source,OutputStream out):�����ļ�
		//���Կ����������ֻҪ��·����������Ϳ��Ը����ļ������ڵ�IO��ȡ�������ݸ���
		Files.copy(Paths.get("G:\\a.txt"),new FileOutputStream("F:\\a.txt"));		
	}

}
