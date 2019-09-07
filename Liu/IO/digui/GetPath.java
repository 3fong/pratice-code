package digui;

import java.io.File;

/*
 *需求：请大家把D:\Demo目录下所有的java结尾的文件的绝对路径给输出在控制台。
 *	A 创建文件对象
 *	B 获取文件对象集合
 *	C 获取名称，判断是否是文件夹
 *		是 回到B
 *		否 输出绝对路径
 */
public class GetPath {

	public static void main(String[] args) {
		File file = new File("D:\\Demo");
		
		show(file);
	}
	public static void show(File file){
		File[] files = file.listFiles();
		int count =0;
		for(File f : files){
			if(f.isDirectory()){
				show(f);
			}else{				
				if(f.getName().endsWith(".java")){
					count++;
					System.out.println(f.getAbsolutePath());
				}				
			}			
		}
		System.out.println(count);
	}
}
