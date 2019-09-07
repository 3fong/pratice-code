package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *���󣺸��Ƶ����ļ���
 *		���ƣ������ж�ȡ��������������ļ��м������ݣ�����ʹ���ֽ���
 */
public class CopyFolderDemo {

	public static void main(String[] args) throws IOException {
		File origin = new File("F:\\demo");
		File aim = new File("F:\\test");
		if(!aim.exists()){
			aim.mkdir();
		}		
		
		File[] files = origin.listFiles();
		for(File f: files){			
			//���帴�ƺ��ļ��ľ���·�����������
			File newAim = new File(aim,f.getName());
			//���ö�ȡ�������������Դ��Ŀ�ġ�
			show(f,newAim);			
		}

	}
	public static void show(File origin,File aim) throws IOException{
		FileInputStream fis = new FileInputStream(origin);
		FileOutputStream fos = new FileOutputStream(aim);
		
		byte[] bytes = new byte[1024];
		int len=0;
		while((len=fis.read(bytes))!=-1){
			fos.write(bytes,0, len);
		}
		fis.close();
		fos.close();
	}
}
