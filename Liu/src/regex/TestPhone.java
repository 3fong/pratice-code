package regex;

import java.util.Scanner;

/*
 ** 判断功能
 *		String类的public boolean matches(String regex)
 * 需求：
 * 		判断手机号码是否满足要求?
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
