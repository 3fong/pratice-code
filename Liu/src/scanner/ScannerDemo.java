package scanner;
/*
 * Scanner ������int��������String����ʱ�����ֻ������һ����
 * ������Ϊ��String���Ͱ������ֵ�ԭ������
 * ����ʽ��
 * 1 ��дһ��Scanner���
 * 2 ���ַ������գ��ٽ�����ת��int���� ????
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
