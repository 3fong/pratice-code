package regex;

import java.util.Scanner;

/*
 *�ָ��
 *		String���public String[] split(String regex)
 *		���ݸ���������ʽ��ƥ���ִ��ַ����� 
 *		��������
 * 			�Ա�Ů
 * 			��Χ��"18-24"
 * 		age>=18 && age<=24
 */
public class SplitString {

	public static void main(String[] args) {
		String age = "18-24";
		String regex = "-";
		
		String[] strArray = age.split(regex);
//		for(int x=0;x<strArray.length;x++){
//			System.out.println(strArray[x]);
//		}
		//���ַ���ת��int
		int young = Integer.parseInt(strArray[0]);
		int old = Integer.parseInt(strArray[1]);
		
		Scanner s = new Scanner(System.in);
		int age1 = s.nextInt();
		
		if(age1>=young && age1<=old){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
