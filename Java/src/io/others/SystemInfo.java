package io.others;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

/*
 *System��ϵͳ������Ϣ�ı�
	Properties getProperties():��ȡϵͳ��Ϣ��
	void list(PrintStream out):����Ϣ�����ָ��������С�
	PrintStream("sysinfo.txt"):�����������ݴ���ָ���ļ��С�
4 ͨ��System���setIn��setOut�������Զ�Ĭ���豸���иı䡣
	System.setIn(new FileInputStream("1.txt"))����Դ�ĳ��ļ�1.txt��
	System.setOut(new FileOutputStream("2.txt"))����Ŀ�ĸĳ��ļ�2.txt��

 */
public class SystemInfo {

	public static void main(String[] args) throws FileNotFoundException {
		Properties p = System.getProperties();
		//�޸����·��
		System.setOut(new PrintStream("F:\\system.txt"));
		//��ϵͳ��Ϣ���������̨		
		p.list(System.out);
	}
}
