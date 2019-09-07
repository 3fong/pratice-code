package digui;

import java.io.File;

/*
 *�������Ұ�D:\DemoĿ¼�����е�java��β���ļ��ľ���·��������ڿ���̨��
 *	A �����ļ�����
 *	B ��ȡ�ļ����󼯺�
 *	C ��ȡ���ƣ��ж��Ƿ����ļ���
 *		�� �ص�B
 *		�� �������·��
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
