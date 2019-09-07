package io.file;

import java.io.File;

/*
 *�г�Ŀ¼���������ݣ����Ρ�
 */
public class DiGuiFileDemo {

	public static void main(String[] args) {
		File file = new File("D:\\Demo");
		show(file,0);
	}
	
	private static void show(File file,int level) {
		File[] files = file.listFiles();
		System.out.println(getLevel(level)+file.getName());
		level++;
		for(File f : files){
			if(f.isDirectory())
				show(f,level);
			else{
				System.out.println(getLevel(level)+f.getName());
			}			
		}
	}

	private static String getLevel(int level) {
		StringBuilder sb = new StringBuilder();
		sb.append(" |");
		for(int x=0;x<level;x++){
			sb.insert(0,"-|");
		}
		return sb.toString();
	}

}
