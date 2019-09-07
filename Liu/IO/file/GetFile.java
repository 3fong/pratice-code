package file;

import java.io.File;

/*��ȡ���ܣ�
 * public String getAbsolutePath()����ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 * public long length():��ȡ���ȡ��ֽ���
 * public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
 * 
 *��ȡ���ܣ�
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е��������� 
 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */
public class GetFile {

	public static void main(String[] args) {
		File file = new File("C:\\");
		
		String[] st = file.list();
		for(String s : st){
			System.out.println(s);
		}
		System.out.println("-----------------------------------");
		File[] files = file.listFiles();
		for(File f : files){
			System.out.println(f.getName()+":"+f.getPath());
		}
	}

}
