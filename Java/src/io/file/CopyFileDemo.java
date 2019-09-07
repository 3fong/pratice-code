package io.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 **���󣺸���ָ��Ŀ¼�µ�ָ���ļ������޸ĺ�׺��
	 * ָ�����ļ��ǣ�.java�ļ���
	 * ָ���ĺ�׺���ǣ�.jad
	 * ָ����Ŀ¼�ǣ�jad
 * ������
 * 	�ѵ����ڻ������������String��replace(old,new)����
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException{
		File src = new File("F:\\��ϰ�ļ�");		
		//�ж�Ŀ���ļ���Դ�϶����ڣ�Ŀ�Ĳ�һ��
		File aim = new File("F:\\�½��ļ���");
		if(!aim.exists())
			aim.mkdir();
		
//		getSrcFile(src,aim);
		getSrcFile2(src,aim);
	}
	//��ȡȫ���ļ�����ɸѡ
	private static void getSrcFile(File src,File aim) throws IOException{
		File[] files = src.listFiles();
		for(File f: files){
			if(f.isDirectory())
				getSrcFile(f,aim);
			else{
				//��ȡ������
				String newName = f.getName().replace(".txt",".java");
				File newFile = new File(aim,newName);
				copyFile(f,newFile);
			}				
		}
	}
	//��ɸѡ�����ȡ ����ֻ���ȡ����Ŀ¼����
	private static void getSrcFile2(File src,File aim) throws IOException{
		File[] files = src.listFiles(new FilenameFilter(){
			@Override
			public boolean accept(File dir, String name) {
				
				return new File(dir,name).isFile()&&name.endsWith(".txt");
			}
		});
		for(File f: files){
			String newName = f.getName().replace(".txt",".java");
			File newFile = new File(aim,newName);
			copyFile(f,newFile);			
		}
	}
	private static void copyFile(File f, File newFile) throws IOException{
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(newFile);
		
		char[] chs = new char[1024];
		int len =0;
		while((len=fr.read(chs))!=-1){
			fw.write(chs,0,len);
		}
		fr.close();
		fw.close();
	}
}
