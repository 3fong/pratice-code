package io.file;

import java.io.File;

/*
 *�ݹ飺���������������ı�����ʽ�����ַ��������Ϻ��к�С���н�����
	2.2 ע�����
	a Ҫ�г��ڣ���������ѭ����
	b ע��ݹ��������ڴ��������Ϊÿ�ε����Լ�����ִ����һ�ε����Լ��ķ��������Ի᲻��
	��ջ�ڴ��п����¿ռ䣬�����࣬�ᵼ���ڴ������
	c ���췽�����ܵݹ顣
 */
public class DiGuiDemo {

	public static void main(String[] args) {
		File file = new File("F:\\");
		int num = getNum(89);
		System.out.println(num);
		
		show(file);
	}

	private static int getNum(int i) {
		if(i==1)//�г��ڣ���ֹ��ѭ��
			return 1;
		return i+getNum(i-1);//ע�����
	}

	private static void show(File file) {
		File[] files = file.listFiles();
		for(File f: files){
			if(f.isDirectory()){
				show(f);
			}else{
				System.out.println(f.getName()+":"+f.getPath());
			}
		}
	}	
}
