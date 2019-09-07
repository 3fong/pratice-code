package io;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	public static void main(String[] args) {
		//创建整个方法内对象
		FileWriter fw = null;
		try{
			// FileWriter(String fileName, boolean append) :对文件进行续写
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
