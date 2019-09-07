package test33;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 *复制一个文件夹到另一个目录下。
 *分析：
 *		复制文件夹，用到递归，
 *		建立源和目的文件夹，一般源肯定存在，判断目的文件是否存在，不存在就创建
 *		建立递归方法，首先判断是否是文件夹，是就要在新文件中创建文件同名文件夹
 *		遍历文件，进行再次递归
 *		因为现在的目的已经发生变化，需要重建目的，并调用IO进行复制
 */
public class T21CopyFolderDemo {

	public static void main(String[] args) throws IOException{
		File src = new File("F:\\练习文件");
		File aim = new File("F:\\a");
		if(!aim.exists())
			aim.mkdir();
		
		show(src,aim);
	}

	private static void show(File src, File aim) throws IOException{
		if(src.isDirectory()){
			File folder = new File(aim,src.getName());
			folder.mkdir();
			
			File[] files = src.listFiles();
			for(File f : files){
				//注意这里递归的源和目的都变成了新地址
				show(f,folder);
			}
		}else{
			File newFile = new File(aim,src.getName());
			
			InOut(src,newFile);
		}
	}

	private static void InOut(File src, File newFile) throws IOException{
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(src));
		PrintStream ps = new PrintStream(newFile);
		
		byte[] bys = new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1){
			ps.write(bys,0,len);
		}
		bis.close();
		ps.close();
	}
}
