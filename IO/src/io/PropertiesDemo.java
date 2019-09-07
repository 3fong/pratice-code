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
		
		//1.6之后load可以加载字符流
		pro.load(br);
		//无法修改源文件
		pro.setProperty("lisi", "10");
		
		//store可以重新存储数据，也就可以修改源文件
		FileWriter fw = new FileWriter("infop.txt");
		pro.store(fw, "love");
		System.out.println(pro);
		br.close();
		fw.close();
	}
	/*
	 * 将文件中的元素存储到集合
	 * 思路：
	 * 1 要读取文件，用到读取流
	 * 2 存储到集合，用"="切割
	 * 3 定义键和值
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
