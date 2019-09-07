package test33;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 *�ѵ�ǰ�ı��е������ı�����,����һ��txt�ļ�,ͳ��ÿ���ַ����ֵĴ���
 * �����,����   a : 21��   b: 12��.....
	������
		���������������1 �����ļ��� 2 ͳ���ַ����ִ���
		���ǻ�ȡ�ַ����ִ�����IO�棬��ͬ�����ַ��������Լ����������Ǵ��ļ��л�ȡ
 */
public class T14GetNumIODemo {

	public static void main(String[] args) throws IOException{
		File src = new File("F:\\stu.txt");
		File aim = new File("F:\\s.txt");
		getFile(src,aim);
	}

	private static void getFile(File src,File aim) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(src));
		PrintWriter pw = new PrintWriter(aim);
		
		String line = null;
		while((line=br.readLine())!=null){
			pw.println(line);
			getNum(line);			
		}
		br.close();
		pw.close();
	}

	private static void getNum(String line) {
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		char[] chs = line.toCharArray();
		
		int count = 0;
		for(char c : chs){
			//��ΪֻҪ�ַ����ִ���������Ҫɸѡ����
			if(Character.isLowerCase(c)||Character.isUpperCase(c)){
				Integer value = tm.get(c);
				if(value!=null)
					count=value;
				count++;
				tm.put(c,count);
				count=0;
			}
		}
		//�������ϻ�ȡ�ַ����ִ���
		Set<Map.Entry<Character,Integer>> set = tm.entrySet();
		for(Map.Entry<Character,Integer> me :set){
			Character c = me.getKey();
			Integer i = me.getValue();
			System.out.print(c+"("+i+")");
		}
	}
}
