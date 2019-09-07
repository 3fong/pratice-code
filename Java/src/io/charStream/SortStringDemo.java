package io.charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.TreeSet;

/*
 *��֪s.txt�ļ����������һ���ַ���hcexfgijkamdnoqrzstuvwybpl��
 * ���д�����ȡ������ݣ�����������д��ss.txt�С�
 * ������
 * 		����һ�� �ַ������ü��ϣ�Ҫ��֤Ψһ����set
 * 		    	 ���������ַ���
 * 		�����������������򷽷�
 */
public class SortStringDemo {

	public static void main(String[] args) throws IOException{
		File src = new File("F:\\a.txt");
		File aim = new File("F:\\ss.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(src));
//		sortString(br,aim);
		sortString2(br,aim);
	}
	//�ַ������ü��ϣ�Ҫ��֤Ψһ����set
	private static void sortString(BufferedReader br,File aim) throws IOException{
		TreeSet<Character> ts = new TreeSet<Character>();
		String line = null;
		while((line=br.readLine())!=null){
			char[] chs = line.toCharArray();
			for(char c : chs){
				ts.add(c);
			}
		}
		br.close();
		outFile(ts,aim);
	}
	private static void sortString2(BufferedReader br,File aim) throws IOException{
		String line = null;
		char[] chs = null;
		while((line=br.readLine())!=null){
			chs = line.toCharArray();
		}
		Arrays.sort(chs);		
		br.close();
		PrintWriter pw = new PrintWriter(new FileWriter(aim),true);
		for(char c : chs){
			pw.print(c);
		}
		pw.close();
	}
	private static void outFile(TreeSet<Character> ts,File aim) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(aim),true);
		for(Character c : ts){
			pw.print(c);
		}
		pw.close();
	}
}
