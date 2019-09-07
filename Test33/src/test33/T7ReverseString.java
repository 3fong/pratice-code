package test33;

import java.util.ArrayList;
import java.util.Collections;

/*
 *8�� ���ַ����н��з�ת��abcde --> edcba
 *	������
 *		����һ���ַ�����ת����Ҫ���нǱ�������õ�����
 *		��������StringBuilder reverese����
 *		����������Ȼ����Ҳ���ԣ�����reverse�����ܼ��
 */
public class T7ReverseString {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(s);
		String s3 = myReverse3(s);
		System.out.println(s3);
		
		//�����ģ�StringBuilderֱ��ת��
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}

	private static String myReverse1(String s) {
		char[] chs = s.toCharArray();
		for(int x =0;x<chs.length/2;x++){
			char temp = chs[x];
			chs[x]=chs[chs.length-1-x];
			chs[chs.length-1-x]=temp;
		}
		//����ת�ַ���valueOf(char[])��String(char[])���췽����
		return String.valueOf(chs);
	}
	private static String myReverse2(String s) {
		StringBuilder sb = new StringBuilder();
		char[] chs = s.toCharArray();
		for(char c : chs){
			sb.append(c);
		}
		return sb.reverse().toString();
	}
	private static String myReverse3(String s) {
		ArrayList<Character> al = new ArrayList<Character>();
		char[] chs = s.toCharArray();
		
		for(char c : chs){
			al.add(c);
		}
		Collections.reverse(al);
		String str = "";
		for(Character c : al){
			str+=c;
		}
		return str;
	}
}
