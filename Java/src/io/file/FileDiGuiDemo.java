package io.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 *���󣺽�һ��ָ��Ŀ¼�µ�java�ļ��ľ��·�����洢��һ���ı��ļ��С�
����һ��java�ļ��б��ļ���
 */
public class FileDiGuiDemo {

	public static void main(String[] args) throws IOException{
		File src = new File("D:\\Demo");
		File aim = new File("F:\\list.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(aim));
		int count=0;
		show(src,bw,count);
		
	}

	private static void show(File src, BufferedWriter bw,int count) throws IOException{
		File[] files = src.listFiles();
		for(File f:files){
			if(f.isDirectory())
				show(f,bw,count);
			else{
				if(f.getName().endsWith(".java")){
					bw.write(f.getAbsolutePath());
					bw.newLine();
					bw.flush();
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
