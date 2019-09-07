package io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *�ַ����Ļ�����-->BufferedWriter��BufferedReader
a ���ã������Ļ��϶����Ĺ��ܽ�������ǿ�����Ի�����֮ǰ�������ж�Ӧ��������
b ԭ�?�������������ʽ�������ڲ������һ����ȡ������������ݵ����ڴ��ϵĶ�ȡƵ�ʣ����Ч�ʡ�
	newLine():���ϵͳ���������з� readLine()��һ�ζ�ȡһ����ݣ�������ĩβ���� null
	�����Լ����ж�д����������5�ֶ�д����
 */
public class BufferedRWDemo {

	public static void main(String[] args) throws IOException{
		File src = new File("F:\\z.txt");
		File aim = new File("F:\\a4.txt");
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(aim);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		myRead1(fr,fw);
		myRead2(fr,fw);
		myRead3(br,bw);
		myRead4(br,bw);
		myRead5(br,bw);
	}

	private static void myRead1(FileReader fr, FileWriter fw) throws IOException{
		int len=0;
		while((len=fr.read())!=-1){
			fw.write(len);
		}
		fr.close();
		fw.close();
	}

	private static void myRead2(FileReader fr, FileWriter fw) throws IOException{
		char[] chs = new char[1024];
		int len=0;
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
		}
		fr.close();
		fw.close();
	}

	private static void myRead3(BufferedReader br, BufferedWriter bw) throws IOException{
		int len = 0;
		while((len=br.read())!=-1){
			bw.write((char)len);
		}
		br.close();
		bw.close();
	}

	private static void myRead4(BufferedReader br, BufferedWriter bw) throws IOException{
		char[] chs=new char[1024];
		int len=0;
		while((len=br.read(chs))!=-1){
			bw.write(chs,0,len);			
		}
		br.close();
		bw.close();
	}

	private static void myRead5(BufferedReader br, BufferedWriter bw) throws IOException{
		String line=null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
