package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceStreamDemo {

	public static void main(String[] args)throws IOException {
		sequenceDemo();
	}
	public static void sequenceDemo()throws IOException{
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		
		v.add(new FileInputStream("F:\\1.txt"));
		v.add(new FileInputStream("F:\\2.txt"));
		v.add(new FileInputStream("F:\\3.txt"));
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream ss = new SequenceInputStream(en);
		
		FileOutputStream fo = new FileOutputStream("F:\\4.txt");
		
		byte[] buf = new byte[1024];
		int len=0;
		while((len=ss.read(buf))!=-1){
			fo.write(buf,0,len);
			
		}
		fo.close();
		ss.close();		
	}
}
