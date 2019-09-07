package file;

import java.io.File;

/*
 *���󣺰�E:\����\���������������Ƶ�����޸�Ϊ
 * 		00?_����.txt
 * ˼·��
 * 		��װĿ¼
 * 		������ȡĿ¼����
 * 		�������飬��ȡfile����
 * 		ƴ�����ƣ�����
 */
public class FileTest {

	public static void main(String[] args) {
		File file = new File("F:\\sanguo");
		
		File[] files = file.listFiles();
		for(File f : files){
			//E��������������������_001_[������-����ܸ���,�����IO��]_��԰������
			String name = f.getName();
			
			int index = name.indexOf('_');
			String start = name.substring(index+1,index+4);
			
			int endIndex = name.lastIndexOf('_');
			String end = name.substring(endIndex);
			
			String newName = start.concat(end);
			
//			System.out.println(newName);
			File newFile = new File(file,newName);
			
			f.renameTo(newFile);
		}
	}

}
