package regex;

import java.util.Scanner;

/*
 ** �жϹ���
 *		String���public boolean matches(String regex)
 * ����
 * 		�ж��ֻ������Ƿ�����Ҫ��?
 */
public class TestPhone {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String p = s.nextLine();
		System.out.println(test(p));
	}
	public static boolean test(String p){
		String regex = "[1][3,8]\\d{9}";
		boolean flag = p.matches(regex);
		return flag;
	}
}
