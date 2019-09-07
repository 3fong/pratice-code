package io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 *File���������ļ����ļ��з�װ�ɶ���һ��������File�����ʾ�ĳ���·���������ı䡣
	File���������Ϊ����ݸ����Ĺ��캯��
	�����У���ɾ����
 */
public class FileMethodDemo {

	public static void main(String[] args) throws IOException{
		//File��Ĺ��췽��
		File file1 = new File("F:\\a.txt");
		File file2 = new File("F:\\","a.txt");
		File file = new File("F:\\aa\\bb");
		File file3 = new File(file,"a.txt");
		myAdd(file);
//		myDel(file3);
//		myJudge(file3);
//		myGet(file);
	}


	private static void myJudge(File file) {
		file.canExecute();
		file.isDirectory();
		file.isFile();
		file.exists();
		file.isHidden();
		file.isAbsolute();
	}

	private static void myAdd(File file) throws IOException{
		if(!file.exists()){//file������ʱ������
			File f = new File("F:\\aa");
			System.out.println(f.mkdir());
//			file.mkdirs();//����ļ�·������
//			file.createNewFile();			
		}
//		System.out.println(file.mkdir());
	}

	private static void myDel(File file) {
		file.delete();
		file.deleteOnExit();//�˳�ʱɾ��
	}	

	private static void myGet(File file) {
		file.getName();
		file.getPath();
		file.getAbsolutePath();
		long time = file.lastModified();//���һ�α��޸�ʱ��
		long chang = file.length();
		
		File[] fi = file.listFiles();//Ҳ�пɽ��չ������ķ���
		//��ȡ������Ϣ���ٽ���ɸѡ
		String[] name = file.list();
		
		//����һ���ļ������������ɸѡ���ٴ��룬�����ж�������������
		String[] nam = file.list(new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
				
				return dir.getName().endsWith(".java");
			}
			
		});
	}
}
