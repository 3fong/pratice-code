package math;

import java.util.Scanner;

/*
 *���������һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ��������
 */
public class MathDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		
		for(int x=0;x<10;x++){
			int num = show(start,end);
			System.out.println(num);
		}
	}
	public static int show(int start,int end){
		int num = (int)(Math.random()*(end-start+1))+start;
		return num;
	}
}
