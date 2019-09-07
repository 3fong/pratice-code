package io;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args) {
		//�������������ڶ���
		FileWriter fw = null;
		try{
			// FileWriter(String fileName, boolean append) :���ļ�������д
			fw = new FileWriter("D:\\demo.txt",true);
			fw.write("adaad");
			fw.write("adaad\r\ngirl");
		}
		catch(IOException e){
			System.out.println("catch:"+e.toString());
		}
		finally{
			try{
				if(fw!=null)
					fw.close();
			}
			catch(IOException e){
				System.out.println(e.toString());
			}
		}
	}
}
