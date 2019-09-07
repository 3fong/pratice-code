package scanner;
/*
 * Scanner 先输入int类再输入String类型时，结果只能输入一个。
 * 个人认为是String类型包括数字的原因引起
 * 处理方式：
 * 1 再写一个Scanner语句
 * 2 用字符串接收，再将数字转成int类型 ????
 */
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int i = s.nextInt();
		
//		Scanner s2 = new Scanner(System.in);
		String str1 = s.nextLine();
		
		String str = s.nextLine();
		
		System.out.println(str1+str);
	}
}
