package digui;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *���󣺵ݹ�ɾ�������ݵ�Ŀ¼
 *������
 *	A �����ļ�����
 *	B ��ȡ�ļ�����
 *	C �������飬��ȡ�ļ�
 *	D �ж��Ƿ����ļ�
 *		��  ɾ��
 *		��  ���ص�C
 *
 *	2015-12-03 12:14:21 ��С�İ������ļ�����ȫ��ɾ����
 *	��д�����飬������ʧȥ���ļ���Ҳϣ���Ժ󿪷���ע�⣬javaɾ��
 *	���߻���վ������������������
 */
public class DeleteFile {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sd.format(d);
		System.out.println(s);
				
	}
	public static void show(File file){
		File[] files = file.listFiles();
		for(File f : files){
			if(f.isDirectory()){
				show(f);
			}else{
				//ɾ���ļ�
				System.out.println(f.getName()+"---"+f.delete());
			}
			//ɾ���ļ���
			System.out.println(file.getName()+"---"+file.delete());
		}
	}
}
