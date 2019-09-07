package io.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *���ƶ༶�ļ�������
 *��.java��β�ļ�ȫ������Ϊ.txt������ԭʼĿ¼
 */
public class CopyFileDemo2 {

	public static void main(String[] args) throws IOException{
		File origin = new File("F:\\a");
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
		//��Ҫ���Ƹ�Ŀ¼���ļ���
		if(origin.isDirectory()){
			//�����ļ��A
			File folder = new File(aim,origin.getName());
			folder.mkdir();
				
			File[] files = origin.listFiles();
			for(File f: files){
				show(f,folder);
			}
		}else{
			if(origin.getName().endsWith(".java")){
				File newAim = new File(aim,origin.getName().replace(".java",".txt"));				
				InOut(origin,newAim);
			}
		}		
	}
	//�ļ��漰Ӱ���ļ���Ӧʹ���ֽ���
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
