package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *需求：复制单极文件夹
 *		复制，代表有读取和输出，对象是文件夹及其内容，所以使用字节流
 */
public class CopyFolderDemo {

	public static void main(String[] args) throws IOException {
		File origin = new File("F:\\demo");
		File aim = new File("F:\\test");
		if(!aim.exists()){
			aim.mkdir();
		}		
		
		File[] files = origin.listFiles();
		for(File f: files){			
			//定义复制后文件的绝对路径，方便输出
			File newAim = new File(aim,f.getName());
			//调用读取输出方法，传入源和目的。
			show(f,newAim);			
		}

	}
	public static void show(File origin,File aim) throws IOException{
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(aim);
		
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=fis.read(bytes))!=-1){
			fos.write(bytes,0, len);
		}
		fis.close();
		fos.close();
	}
}
