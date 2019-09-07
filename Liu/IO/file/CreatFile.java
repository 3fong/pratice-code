package file;

import java.io.File;
import java.io.IOException;

/*
 *File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
 * ���췽����
 * 		File(String pathname)������һ��·���õ�File����
 * 		File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
 * 		File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
 *�������ܣ�
 *public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
 *public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
 *public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
 *ע�⣺�㵽��Ҫ�����ļ������ļ��У����������������Ҫ������
 *ɾ������:
 *public boolean delete()
 * ע�⣺
 * 		A:����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
 * 		B:Java�е�ɾ�����߻���վ��
 * 		C:Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
 */
public class CreatFile {

	public static void main(String[] args) throws IOException {
		// File(String pathname)������һ��·���õ�File����
		// ��F:\\demo\\a.txt��װ��һ��File���󣬲�δ�����ļ�
		File file1 = new File("F:\\Demo\\a.txt");
		
		File file2 = new File("F:\\Demo","a.txt");
		
		File file = new File("F:\\Demo");
		
		File file3 = new File(file,"a.txt");
		
		create();
		
	}
	public static void create() throws IOException{
		//���������ļ���
		File file1 = new File("F:\\test");
		sop("mkdir:"+file1.mkdir());
		
		//�����ļ���ע����뱣֤�ļ�����
		File file = new File("F:\\test\\a.txt");
		boolean flag = file.createNewFile();
		System.out.println(flag);
		
		//��������ļ���
		File file2 = new File("F:\\A\\B\\C\\D\\E");
		
		sop("delete:"+file2.delete());
//		sop("mkdirs:"+file2.mkdirs());
		file2.deleteOnExit();
		//ɾ���ļ�
		sop("delete:"+file.delete());
		//ɾ���ļ���
		sop("delete:"+file1.delete());
		
		
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
