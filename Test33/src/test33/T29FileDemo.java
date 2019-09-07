package test33;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 *从键盘接受一个字符串,这个字符串是一个文件目录.
 * 将该目录中所有的文件打印在控制台上.
 */
public class T29FileDemo {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		String file = s.nextLine();
		s.close();
		
		File src = new File(file);
		if(!src.exists() && !src.isDirectory()){
			System.out.println("您输的文件有误！");
		}else{
			show(src);
		}		
	}
	private static void show(File src) throws IOException{
		File[] files = src.listFiles();
		for(File f : files){
			if(f.isDirectory())
				show(f);
			else{
				System.out.println(f.getName());
			}
		}
	}
}
