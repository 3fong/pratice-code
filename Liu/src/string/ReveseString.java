package string;

import java.util.Scanner;

/*
 * �ַ�����ת
 * ����������¼�롱abc��		
 * ����������cba��
 * ������
 * 		ת�����ַ����飬����λ�ý���
 * 		���Ž�¼��ֵ��������
 */
public class ReveseString {

	public static void main(String[] args) {
		reveseDemo2();
	}
	public static void reveseDemo(){
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		char[] chs = str.toCharArray();
		for(int start=0,end=chs.length-1;start<end;start++,end--){
			char temp = chs[start];
			chs[start]=chs[end];
			chs[end]=temp;
		}
		System.out.println(chs);
	}
	/*
	 *  A:����¼��һ���ַ���
 * 		B:����һ�����ַ���
 * 		C:���ű����ַ������õ�ÿһ���ַ�
 * 			b:���ַ���ת���ַ�����
 * 		D:�����ַ�����ÿһ���ַ�ƴ������
 * 		E:����´�
	 */
	public static void reveseDemo2(){
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		char[] chs = str.toCharArray();
		String result = "";
		for(int x=chs.length-1;x>=0;x--){
			result+=chs[x];
		}
		System.out.println(result);
	}
}
