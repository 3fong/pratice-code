package io.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 *
 */
public class MyCount {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\count.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		limitCount(file);	
		
	}

	private static void limitCount(File file) throws IOException{
		Properties p = new Properties();
		FileReader fr = new FileReader(file);
		p.load(fr);
		fr.close();
		
		int count =5;
		String value = p.getProperty("count");
		//һ�����ж���if����while���붨�嶨�������
		if(value!=null){
			count = Integer.parseInt(value);
			if(count<=1){
				System.out.println("��Ǯ");
				return;//breakֻ������ѭ����
			}
		}	
		count--;
		System.out.println("�㻹�����ã�"+count+"��");
		FileWriter fw = new FileWriter(file);
		p.setProperty("count",count+"");
		p.store(fw,"love");
		fw.close();
	}
}
