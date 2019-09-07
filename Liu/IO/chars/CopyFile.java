package chars;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *1:�����ı��ļ� 5�ַ�ʽ
	g:\\a.txt
	f:\\b.txt	
	��Ϊ�ַ����漰�ֽ����ַ���ת����������Ҫˢ�£���close����ʱ��flush����ʡ��
 */
public class CopyFile {

	public static void main(String[] args) throws IOException {
		File origin = new File("g:\\a.txt");
		File aim = new File("f:\\b.txt");
//		method1(origin,aim);
//		method2(origin,aim);
		method3(origin,aim);
//		method4(origin,aim);
//		method5(origin,aim);
	}

	private static void method5(File origin, File aim) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(aim));
		
		String line = null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}
	private static void method4(File origin, File aim) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(aim));
		
		char[] chs = new char[1024];
		int ch = 0;
		while((ch=br.read(chs))!=-1){
			bw.write(chs,0,ch);
			
			//���漰ֱ���ڿ���̨���ʱ������ۿ��Ž���ת����Ҫ�Ǹ����ļ�������Ҫ��������
			System.out.println(new String(chs,0,ch));
		}
		br.close();
		bw.close();
	}
	private static void method3(File origin, File aim) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(origin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(aim));
		
		int ch = 0;
		while((ch=br.read())!=-1){
			bw.write(ch);
//			System.out.println((char)ch);
		}
		br.close();
		bw.close();
	}
	private static void method2(File origin, File aim) throws IOException {
		FileReader fr = new FileReader(origin);
		FileWriter fw = new FileWriter(aim);
		
		char[] chs = new char[1024];
		int ch = 0;
		while((ch=fr.read(chs))!=-1){
			fw.write(chs,0,ch);
		}
		fr.close();
		fw.close();
	}
	private static void method1(File origin, File aim) throws IOException {
		FileReader fr = new FileReader(origin);
		FileWriter fw = new FileWriter(aim);
		
		int ch = 0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
