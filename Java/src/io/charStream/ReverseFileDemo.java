package io.charStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *���󣺶�ȡa.txt,��������ݷ�ת�������b.txt
 *������
 *		�з�ת���ܵ���Collections StringBuilder��ת��������Ҳ���Է�ת����ֱ�ӷ���
 */
public class ReverseFileDemo {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\a.txt");
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter("F:\\b3.txt");
		
		char[] chs = new char[1024];
		int len = 0;
		while((len=fr.read(chs))!=-1){
//			swap(chs,0,len);
//			String s =swap2(chs,0,len);
			String s = swap3(chs);			
			fw.write(s.trim());
			fw.flush();
		}
		fr.close();
		fw.close();
	}
	//����һ
	private static void swap(char[] chs,int start,int end) {
		for(int x=start,y=end-1;x<=y;x++,y--){
			char temp = chs[x];
			chs[x]=chs[y];
			chs[y]=temp;
		}
	}
	private static String swap2(char[] chs, int i, int len) {
		StringBuilder sb = new StringBuilder();
		sb.append(chs,0,len);
		sb.reverse();
		return sb.toString();
	}
	private static String swap3(char[] chs) {
		List<Character> list = new ArrayList<Character>();
		
		for(char c : chs){
			list.add(c);
		}
		Collections.reverse(list);
		
		String s = "";
		for(Character c : list){
			s+=c;
		}
		return s;
	}
}
