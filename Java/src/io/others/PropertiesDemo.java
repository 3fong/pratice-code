package io.others;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 *Properties��hashtable�����ࡣ������߱�Map���ϵ��ص㡣
 *������洢�ļ�ֵ�Զ����ַ��޷��Ͷ��塣���Ǽ��Ϻ�IO�������ϵļ���������
     �ص㣺
	a �������ڼ�ֵ����ʽ�������ļ���
	b �ڼ������ʱ����Ҫ����й̶���ʽ����=ֵ��
	c �����е���ݿ��Ա��浽���л�����л�ȡ��
 */
public class PropertiesDemo {

	public static void main(String[] args) throws IOException{
//		loadDemo();
//		method();
		myLoad();
	}
	private static void method(){
		Properties p = new Properties();
		//���ú��޸�
		p.setProperty("zhagns","beijing");
		p.setProperty("lisi","beijing");
		
		//��ȡ���м�
		Set<String> names = p.stringPropertyNames();
		for(String s : names){
			String value = p.getProperty(s);
			System.out.println(s+":"+value);
		}
	}
	//���غʹ洢
	private static void loadDemo() throws IOException{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("F:\\a.txt");
		
		p.load(fis);
		p.setProperty("����","39");
		FileOutputStream fos = new FileOutputStream("F:\\a.txt");
		p.store(fos,"love");
		System.out.println(p);
		p.list(System.out);//�������б������ָ����������С�
		
		fis.close();
		fos.close();
	}
	//ģ��load��������������ݴ洢��������
	public static void myLoad() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
		Properties p = new Properties();
		String line=null;
		while((line=br.readLine())!=null){
			String[] sts = line.split("=");
			p.setProperty(sts[0],sts[1]);
		}
		br.close();
		System.out.println(p);
	}
}
