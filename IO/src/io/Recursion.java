package io;

import java.io.File;

public class Recursion {

	public static void main(String[] args) {
		File dir = new File("D:\\Demo");
		showDir(dir,0);
	}
	public static String getLevel(int level){
		StringBuilder sb = new StringBuilder();
		sb.append("!--");
		for(int x=0;x<level;x++){
			sb.insert(0,"| ");
		}
		return sb.toString();
	}
	public static void showDir(File dir,int level){
		System.out.println(getLevel(level)+dir);
		level++;
		File[] files = dir.listFiles();
		for(int x=0;x<files.length;x++){
			if(files[x].isDirectory())
				showDir(files[x],level);
			else
				System.out.println(getLevel(level)+files[x]);
		}
	}
}
