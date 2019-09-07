package string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *��ȡ�����ַ��з�Ϲ�����Ӵ�ȡ����
 *�������裺
	1����������ʽ��װ�ɶ���
	2������������Ҫ�������ַ������
	3�������󣬻�ȡ����ƥ�����档
	4��ͨ������Է�Ϲ�����Ӵ����в���������ȡ����
 */
public class RegexMethod1 {

	public static void main(String[] args) {
		String str = "ming tian jiu yao fang jia le , da jia";
		getString(str);
	}

	private static void getString(String str) {
		//�ַ�߽�ʹ���ַ���������ming��ӡ������
		String regex = "\\b[a-z]{4}\\b";
		//�������װ��������
		Pattern p = Pattern.compile(regex);
		//���������������ַ��������ȡƥ����
		Matcher m = p.matcher(str);
		boolean b = m.matches();//�жϹ��������ַ��Ƿ�����
//		System.out.println(b);
//		boolean b1 = m.find();
//		String s = m.group();
//		System.out.println(b1);
//		System.out.println(s);
//		int i = m.start();
//		int e = m.end();
//		System.out.println(i+":"+e);
		while(m.find()){
			System.out.println(m.group());
			System.out.println(m.start()+"---"+m.end());//��ϱ�׼�ַ�ĽǱ�ֵ
		}
	}	
}
