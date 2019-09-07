package string.regex;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
 *����1��
	�������ַ�ת�ɣ���Ҫѧ��̡�
		"����...����...��Ҫ....ҪҪҪҪ...ѧѧ.ѧ..ѧѧ..���.....�̳�"
	  ������
	  	�е����з�ţ�������ã����滻
      ����2��
      	���ʼ���ַ����У�顣
     ����3��
  	192.68.1.254  102.49.23.13	10.10.10.10	 2.2.2.2  8.109.90.30
	��IP��ַ���е�ַ��˳�������
	������
		����������ͼ��ϣ�
 */
public class RegexTest {

	public static void main(String[] args) {
//		replaceStr();
//		checkEmail();
	}
	private static void checkEmail() {
		String s = "faf@sina.com.cn";
		String regex = "[a-zA-Z1-9][a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+){1,3}";
		String regex2="\\w+@\\w+(\\.\\w+)+";//��Բ���ȷ
		System.out.println(s.matches(regex));
	}
	//�滻�ַ�
	private static void replaceStr() {
		String s = "����...����...��Ҫ....ҪҪҪҪ...ѧѧ.ѧ..ѧѧ..���.....�̳�";
		//������滻���ַ�
		String s1=s.replaceAll("\\.+","");
		System.out.println(s1);
		//������ֻ��һ��
		String s2=s1.replaceAll("(.)\\1+","$1");
		System.out.println(s2);
	}
	
}
