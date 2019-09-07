package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 自定义一个文件使用计数器，达到使用次数，文件就被限制使用
 * 思路：
 * 1 定义计数器
 * 2 将使用次数封装进map集合，
 * 3 封装成文件
 */
public class MyCounter {

	public static void main(String[] args) throws IOException{		
		Properties pro = new Properties();
		
		File file = new File("time.ini");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fi = new FileInputStream(file);
		pro.load(fi);
		
		int count=5;
		String value = pro.getProperty("time");
		if(value!=null){
			count=Integer.parseInt(value);
			if(count<=0){
				System.out.println("该上路了");
				return;
			}
		}
		count--;
		System.out.println("还有"+count+"次机会");
		pro.setProperty("time",count+"");
		
		FileOutputStream fo = new FileOutputStream(file);
		pro.store(fo,"love");
		
		fi.close();
		fo.close();
	}
	
}
