package test33;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 *�Ӽ��̽���һ���ַ���,����ַ�����һ���ļ�Ŀ¼.
 * ����Ŀ¼�����е��ļ���ӡ�ڿ���̨��.
 */
public class T29FileDemo {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		String file = s.nextLine();
		s.close();
		
		File src = new File(file);
		if(!src.exists() && !src.isDirectory()){
			System.out.println("������ļ�����");
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
