package io.file;

import java.io.File;
import java.io.FilenameFilter;

/*
 * ���󣺻�ȡ��׺Ϊjava���ļ�
 *static File[] listRoots():�г����õ��ļ�ϵͳ��Ŀ¼����ϵͳ�̷�
	String[] list()���г���ǰĿ¼�������ļ����������ء�
	String[] list(FilenameFilter filter)����ȡĿ¼������ָ�����������ļ���ơ�
	FilenameFilter:�ļ������������һ���ӿڣ����а�һ��������
		accept(File dir,String name)�����ص���boolean��
	File[] listFiles():����һ������·�������飬��ȡ��ǰ�ļ����µ������ļ����ļ��С�
	File[] listFiles(FilenameFilter filter)����ȡĿ¼������ָ�����������ļ�����
	boolean renameTo(File dest):��������С�
 */
public class FilelistDemo {

	public static void main(String[] args) {
		File file=new File("D:\\Demo\\14IO2");
//		getName(file);
//		getName2(file);
//		getFile(file);
		getFile2(file);
	}
	private static void getFile(File file) {
		File[] files = file.listFiles();
		for(File f : files){
			System.out.println(f.getName()+":"+f.length());
		}
	}
	private static void getFile2(File file) {
		File[] files = file.listFiles(new FilenameFilter(){
			public boolean accept(File f,String s){
				return s.startsWith("F");
			}
		});
		for(File f : files){
			System.out.println(f.getName()+":"+f.length());
		}
	}
	//�Ȼ�ȡ�����ļ������ж�
	private static void getName(File file) {
		String[] sts = file.list();
		for(String s: sts){
			if(s.endsWith(".java"))
				System.out.println(s);
		}
	}
	////���жϣ��ٻ�ȡ�ļ���
	private static void getName2(File file) {
		String[] sts = file.list(new FilenameFilter(){
			public boolean accept(File f,String s){
				return s.endsWith(".java");
			}
		});
		for(String s: sts){
			System.out.println(s);
		}
	}
}
