package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CreateList{
	public static void main(String[] args){
		File dir = new File("D:\\Demo");
		List<File> li = new ArrayList<File>();
		showDir(dir,li);
		
		File f = new File(dir,"JAVA.txt");
		storeList(li,f.toString());
	}
	public static void showDir(File dir,List<File> li){
		File[] files = dir.listFiles();
		for(File f : files){
			if(f.isDirectory())
				showDir(f,li);
			else
				if(f.getName().endsWith(".java"))
					li.add(f);
		}		
	}
	public static void storeList(List<File> li,String str){
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter(str));
			
			for(File f : li){
				String path = f.getAbsolutePath();
				bw.write(path);
				bw.newLine();
				bw.flush();
			}
		}catch(IOException e){
			throw new RuntimeException("–¥»Î ß∞‹");
		}
		finally{
			try{
				if(bw!=null)
					bw.close();
			}catch(IOException e){
				throw new RuntimeException("–¥»Î ß∞‹");
			}
		}	
	}
}