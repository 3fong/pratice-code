package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {

	public static void main(String[] args) throws IOException{
		copyPic();
	}
	public static void copyPic() throws IOException{
		FileInputStream fi = new FileInputStream("D:\\1.bmp");
		FileOutputStream fo = new FileOutputStream("F:\\2.bmp");
		
		byte[] by = new byte[1024];
		int len=0;
		while((len=fi.read(by))!=-1){
			fo.write(by,0,len);
		}
		fi.close();
		fo.close();
	}
}
