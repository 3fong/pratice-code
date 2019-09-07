package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *需求：复制多极文件夹
 *		多级涉及到递归，所以必须建立一个独立的递归方法
 *			返回值：void
 *			参数列表，File
 *			出口：复制完成 ？？？？
 *			规律：不是文件夹就开始复制，是则继续判断
 */
public class CopyFolders2 {

	public static void main(String[] args) throws IOException {
		File origin = new File("F:\\demos");
		File aim = new File("F:\\test");
		if(!aim.exists()){
			aim.mkdir();
		}
		show(origin,aim);
	}
//	public static File delFile(File aim){
//		if(aim.exists()){
//			File[] fi = aim.listFiles();
//			for(File f : fi){
//				if(f.isDirectory())
//					delFile(f);
//				else
//					aim.delete();
//			}			
//		}else{
//			aim.mkdir();
//		}	
//		return aim;
//	}
	public static void show(File origin,File aim) throws IOException{
		//还要复制根目录和文件夹
		if(origin.isDirectory()){
			//建立文件夾
			File folder = new File(aim,origin.getName());
			folder.mkdir();
				
			File[] files = origin.listFiles();
			for(File f: files){
				show(f,folder);
			}
		}else{
			File newAim = new File(aim,origin.getName());				
			InOut(origin,newAim);
		}		
	}
	//文件涉及影音文件，应使用字节流
	private static void InOut(File origin, File newAim) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newAim));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(origin));
		
		byte[] by = new byte[1024];
		int len=0;
		while((len=bis.read(by))!=-1){
			bos.write(by,0,len);
		}
		bis.close();
		bos.close();
	}
}
