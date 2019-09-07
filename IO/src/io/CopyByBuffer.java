package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyByBuffer {

	public static void main(String[] args) {
		copy();
	}
	public static void copy(){
		BufferedReader bf = null;
		BufferedWriter bw = null;
		try{
			bf = new BufferedReader(new FileReader("D:\\Work\\IO\\src\\io\\ReadType.java"));
			bw = new BufferedWriter(new FileWriter("bw.txt"));
			
			String line = null;
			while((line=bf.readLine())!=null){
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
		}
		catch(IOException e){
			throw new RuntimeException("∏¥÷∆ ß∞‹");
		}
		finally{
			try{
				if(bf!=null)
					bf.close();
			}
			catch(IOException e){
				throw new RuntimeException("∂¡»° ß∞‹");
			}
			finally{
				try{
					if(bw!=null)
						bw.close();
				}
				catch(IOException e){
					throw new RuntimeException("–¥»Î ß∞‹");
				}
			}
		}
	}
}
