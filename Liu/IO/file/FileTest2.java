package file;

import java.io.File;

/*
 *G:\\java\\�������\\�������Ա_����_Java������Ƶ�̵̳�01��
 *G:\\java\\�������
 *
 *��Т��java���¼���
 *
 *��Ӧ����
 */
public class FileTest2 {

	public static void main(String[] args) {
		File file = new File("F:\\sanguo");
		
		File[] files = file.listFiles();
		for(File f : files){
			String name = f.getName();
			
			int index = name.indexOf("��");
//			String start = name.substring(index+1, index+11);
//			
//			int index2 = name.indexOf("��");
//			String end = name.substring(index2+1);
			
			String newName = name.substring(index);
						
			File newFile = new File(file,newName);
			f.renameTo(newFile);
		}
	}

}
