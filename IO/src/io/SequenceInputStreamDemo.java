package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class SequenceInputStreamDemo {

	public static void main(String[] args)throws IOException {
		sequenceFile();
	}
	public static void sequenceFile()throws IOException{
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		
		for(int x=1;x<3;x++){
			al.add(new FileInputStream("F:\\"+x+".mp3"));
		}
		final Iterator<FileInputStream> it = al.iterator();
		
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>(){
			public boolean hasMoreElements(){
				return it.hasNext();
			}
			public FileInputStream nextElement(){
				return it.next();
			}
		};
		SequenceInputStream ss = new SequenceInputStream(en);
		
		FileOutputStream fo = new FileOutputStream("F:\\fo.mp3");
		byte[] buf = new byte[1024*1024];
		int len=0;
		while((len=ss.read(buf))!=-1){
			fo.write(buf,0,len);
		}
		fo.close();
		ss.close();		
	}
	public static void splitFile()throws IOException{
		FileInputStream fi = new FileInputStream("F:\\copy.mp3");
		FileOutputStream fo = null;
		
		byte[] buf = new byte[1024*1024];
		int len=0;
		int count=1;
		while((len=fi.read(buf))!=-1){
			fo=new FileOutputStream("F:\\"+count+++".mp3");
			fo.write(buf,0,len);
			fo.close();
		}
		fi.close();
	}
}
