package stringBuffer;

import java.util.Scanner;

/*
 *�ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * ������
 * 		��ʽһ��
 * 		ͨ�������ַ�����ͨ����β�Ǳ��ж�
 * 		��Ҫ���ַ���ת���ַ�����
 * 		ͨ���Ǳ��ж�ֵ
 * 		����ֵ����Ϊboolean
 * 		��ʽ����
 * 		ͨ��StringBuffer��reverse()������ת�ַ�����
 * 		�Աȷ�תֵ��ԭֵ�����ж��Ƿ�Գơ�
 * 		�����б�String 
 * 		����ֵ��boolean
 */
public class DuiChen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(duiChen(str));
		
		System.out.println(duiChen2(str));
	}
	//���󷽷�����Ȼ˼·��ȷ�����Ǵ���ֻͨ����β�Ǳ�ֵ�ж��ַ����Ƿ�Գ� ������������У��������û�аѸ�ֵ��return���أ�
	public static boolean duiChen(String s){
		boolean flag= true;
		char[] chs = s.toCharArray();
		
		for(int x=0;x<chs.length/2;x++){
			if(chs[x]!=chs[chs.length-1-x]){
				flag=false;
				break;
			}
		}
		return flag;
	}
/*	public static boolean duiChen(String s){
		boolean flag = true;
		char[] chs = s.toCharArray();
		for(int start=0,end=chs.length-1;start<=end;start++,end--){
			if(chs[start]!=chs[end]){
				flag=false;
				break;
			}
		}
		return flag;
	}*/
	public static boolean duiChen2(String s){
		/*StringBuffer sb = new StringBuffer(s);
		if(sb.reverse().toString().equals(s)){
			return true;
		}
		return false;*/
		return new StringBuffer(s).reverse().toString().equals(s);
	}
}
