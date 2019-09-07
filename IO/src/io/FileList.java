package io;

import java.io.File;
import java.io.FilenameFilter;

public class FileList {

	public static void main(String[] args) {
		listDemo2();
		
	}
	//����ָ���ļ���ʽɸѡ�ļ���
	public static void listDemo(){
		File f = new File("C:\\Users\\David\\Desktop\\�Լ�java�ʼ�");
		String[] s = f.list(new FilenameFilter(){
			public boolean accept(File f,String name){
				return name.endsWith(".txt");
			}
		});
		for(String name : s){
			System.out.println(name);
		}
	}
	public static void listDemo2(){
		File f = new File("C:\\");
		File[] files = f.listFiles();
		for(File s : files){
			System.out.println(s.getName()+"..."+s.length());
		}
	}
}
