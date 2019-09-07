package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * �Զ���һ���ļ�ʹ�ü��������ﵽʹ�ô������ļ��ͱ�����ʹ��
 * ˼·��
 * 1 ���������
 * 2 ��ʹ�ô�����װ��map���ϣ�
 * 3 ��װ���ļ�
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
				System.out.println("����·��");
				return;
			}
		}
		count--;
		System.out.println("����"+count+"�λ���");
		pro.setProperty("time",count+"");
		
		FileOutputStream fo = new FileOutputStream(file);
		pro.store(fo,"love");
		
		fi.close();
		fo.close();
	}
	
}
