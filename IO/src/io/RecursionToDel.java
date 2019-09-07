package io;

import java.io.File;

public class RecursionToDel {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\David\\Desktop\\Demo");
		del(dir);
	}
	public static void del(File dir){
		File[] files = dir.listFiles();
		for(int x=0;x<files.length;x++){
			if(files[x].isDirectory())
				del(files[x]);
			else
				System.out.println(files[x].toString()+"..files.."+files[x].delete());
		}
		System.out.println(dir+"::dir::"+dir.delete());
	}
}
