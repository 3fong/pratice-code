package test;

import java.util.Scanner;

/*
 * ����¼�룺
 * import java.util.Scanner;
 * ��ʽ��
 * Scanner s = new Scanner(System.in);
 * int x = s.nextInt();
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		if(x<0 || x>100){
			System.out.println("���Ϲ�");
		}
		else if(x>=90 && x<=100){
			System.out.println("��");
		}
		else if(x>=80 && x<90){
			System.out.println("��");
		}
		else if(x>=70 && x<80){
			System.out.println("��");
		}
		else if(x>=60 && x<70){
			System.out.println("�ϸ�");
		}
		else{
			System.out.println("���ϸ�");
		}
	}
}
