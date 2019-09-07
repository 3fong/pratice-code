package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
 *��֪s.txt�ļ�����������һ���ַ�������hcexfgijkamdnoqrzstuvwybpl��
 * ���д�����ȡ�������ݣ������������д��ss.txt�С�
 * ������
 * 		����һ�� �ַ��������ü��ϣ�Ҫ��֤Ψһ����set
 * 		    	 ����������ַ���
 * 		�����������������򷽷�
 */
public class SortString {

	public static void main(String[] args) throws IOException {
//		Set<Character> sc = sortString();
//		outString(sc);
		
		sortOut();
	}
	//������
	public static void sortOut() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
		String line = br.readLine();
		br.close();
		
		//����ȡ�����ַ���ת����������
		char[] chs = line.toCharArray();
		Arrays.sort(chs);
		
		//Writer���write()����ֱ��д�ַ����ַ���
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\c.txt"));
		bw.write(chs);
		bw.close();
	}
	//����һ
	public static Set<Character> sortString() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
		Set<Character> sc = new TreeSet<Character>();
		
		String line = null;
		while((line=br.readLine())!=null){
			char[] chs = line.toCharArray();
			for(int x=0;x<chs.length;x++){
				sc.add(chs[x]);
			}
		}
		br.close();
		return sc;
	}
	public static void outString(Set<Character> sc) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\ss.txt"));
		for(Character ch : sc){
			bw.write(ch);
		}
		bw.close();
		System.out.println("������");
	}
}
