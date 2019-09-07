package io.file;

import java.io.File;

/*
 *���󣺰�E:\����\��������������Ƶ����޸�Ϊ
 *E������������������_001_[������-����ܸ���,�����IO��]_��԰�����
 * 		00?_����.txt
 * ˼·��
 * 		��ȡ��ƣ������ƻ�ȡ�Ǳ꣬����ƴ��
 * 		int index = name.indexOf('_');
 */
public class ChangeFileName {

	public static void main(String[] args) {
		File file = new File("F:\\a");
		File[] files = file.listFiles();
		for(File f : files){
			String name = f.getName();
			int index = name.indexOf('_');			
			//��ȡ�ַ�
			String start = name.substring(index,index+4);
			int lastIndex = name.lastIndexOf('_');
			String end = name.substring(lastIndex);
			
			//ƴ��
			String newName = start.concat(end);//start+end;
			File newFile = new File(file,newName);
			//������
			f.renameTo(newFile);
		}
	}

}
