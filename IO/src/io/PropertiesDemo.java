package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException{
		loadDemo();
	}
	public static void loadDemo()throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("infop.txt"));
		
		Properties pro = new Properties();
		
		//1.6֮��load���Լ����ַ���
		pro.load(br);
		//�޷��޸�Դ�ļ�
		pro.setProperty("lisi", "10");
		
		//store�������´洢���ݣ�Ҳ�Ϳ����޸�Դ�ļ�
		FileWriter fw = new FileWriter("infop.txt");
		pro.store(fw, "love");
		System.out.println(pro);
		br.close();
		fw.close();
	}
	/*
	 * ���ļ��е�Ԫ�ش洢������
	 * ˼·��
	 * 1 Ҫ��ȡ�ļ����õ���ȡ��
	 * 2 �洢�����ϣ���"="�и�
	 * 3 �������ֵ
	 */
	public static void forList()throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("infop.txt"));
		
		Properties pro = new Properties();
		String line=null;
		while((line=br.readLine())!=null){
			String[] arr =line.split("=");
//			System.out.println(arr[0]+"..."+arr[1]);
			pro.setProperty(arr[0],arr[1]);
		}
		br.close();
		System.out.println(pro);
	}
	public static void getPro()throws IOException{
		Properties pro = new Properties();
		
		pro.setProperty("zhangsan","30");
		pro.setProperty("lisi","90");
		pro.setProperty("zhangsa","30");
		pro.setProperty("lisw","90");
//		String v=pro.getProperty("zhangsan");
//		System.out.println(v);
		
		Set<String> name = pro.stringPropertyNames();
		for(String s : name){
			System.out.println(s+"..."+pro.getProperty(s));
		}
//		pro=System.getProperties();
		pro.list(new PrintStream("infop.txt"));
	}
}
