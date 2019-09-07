package file;

import java.io.File;
import java.io.FilenameFilter;

/*
 *�ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.mp3���ļ�������У���������ļ�����
 *˼·��
 *	A:�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ�������������������
 *		�����ļ�����ȡ���ƣ���ȡ��׺��
 * 	B:��ȡ��ʱ����Ѿ��������������ˣ�Ȼ��������ɡ�
 * * Ҫ��ʵ�����Ч�����ͱ���ѧϰһ���ӿڣ��ļ����ƹ�����
 * 	public String[] list(FilenameFilter filter)
 * 	public File[] listFiles(FilenameFilter filter)
 *	
 * accept(File dir,String name):��FilenameFilter�ӿڵķ����������ж��Ƿ������������Ԫ�ء�
 */
public class SelecteDemo {

	public static void main(String[] args) {
		show1();
	}
	public static void show(){
		File file = new File("F:\\");
		
		File[] files = file.listFiles();
		for(File f : files){
			//�ж��Ƿ�Ϊ�ļ�����Ϊ�ļ��п���Ҳ�������β
			if(f.isFile()){
				if(f.getName().endsWith(".mp3")){
					System.out.println(f.getName());
				}
			}
		}
	}
	public static void show1(){
		File file = new File("F:\\");
		
		String[] files = file.list(new FilenameFilter(){
			//�����ж�����
			@Override
			public boolean accept(File dir, String name) {
//				File file = new File(dir,name);
//				boolean flag = file.isFile();
//				boolean flag2 = name.endsWith(".mp3");
//				return flag&&flag2;
				
				return new File(dir,name).isFile()&&name.endsWith(".mp3");
			}			
		});
		for(String s : files){
			System.out.println(s);
		}
	}
}
