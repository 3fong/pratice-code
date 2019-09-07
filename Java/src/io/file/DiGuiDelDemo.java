package io.file;

import java.io.File;
import java.io.IOException;

/*
 *ɾ��һ�������ݵ�Ŀ¼��
	ɾ��ԭ�?
	��Windows�У�ɾ��Ŀ¼����������ɾ��
	��Ȼ�Ǵ���������ɾ�����Ҫ�õ��ݹ顣ɾ����ļ����������վ��
 */
public class DiGuiDelDemo {

	public static void main(String[] args) throws IOException{
		File file = new File("F:\\a");
		if(!file.exists()){
			file.createNewFile();
		}
		long start = System.currentTimeMillis();
		myDel(file);
		long end =System.currentTimeMillis();
		System.out.println("����ʱ��"+(end-start));
	}

	private static void myDel(File file) {
		File[] files = file.listFiles();
		for(File f : files){
			if(f.isDirectory())
				myDel(f);
			else
				System.out.println(f.getName()+":"+f.delete());
		}
		System.out.println(file+":"+file.delete());
	}

}
