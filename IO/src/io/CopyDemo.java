package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args)throws IOException {
		copy2();
	}
	public static void copy1() throws IOException{
		FileWriter fw = null;
		FileReader fr = null;
		try{
			fw=new FileWriter("copy.txt");
			fr=new FileReader("D:\\Work\\IO\\src\\io\\ReadType.java");
			
			int len=0;
			while((len=fr.read())!=-1){
				fw.write(len);
			}
		}
		catch(IOException e){
			throw new IOException("∏¥÷∆ ß∞‹"+e.toString());
		}
		finally{
			try{
				if(fr!=null)
					fr.close();
			}
			catch(IOException e){
				throw new IOException("∂¡»° ß∞‹");
			}
			finally{
				try{
					if(fw!=null)
						fw.close();
				}
				catch(IOException e){
					throw new IOException("–¥»Î ß∞‹");
				}
			}
		}
	}
	public static void copy2()throws IOException{
		FileWriter fw = new FileWriter("copy2.txt");
		FileReader fr = new FileReader("D:\\Work\\IO\\src\\io\\ReadType.java");
		char[] chs = new char[1024];
		int len = 0;
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
		}
		fw.close();
		fr.close();
	}
}
