package io.others;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 *
 */
public class LimitCountDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\c.txt");
		if(!file.exists())
			file.createNewFile();
		FileReader fr = new FileReader(file);
		Properties p = new Properties();
		p.load(fr);
		fr.close();
		
		int count=5;
		String value = p.getProperty("time");
		if(value!=null){
			count = Integer.parseInt(value);
			if(count<=1){
				System.out.println("��Ǯ");
				return;//break������ѭ���в�����
			}
		}
		count--;
		System.out.println("�㻹����"+count+"��");
		p.setProperty("time",count+"");
		FileWriter fw = new FileWriter("F:\\c.txt");
		p.store(fw,"love");
		fw.close();
	}

}
