package collection.tools;

import java.util.Random;
import java.util.Scanner;

/*
 *���������һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ������
 */
public class GetRandomDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		
		for(int x=0;x<100;x++){
//			int num = show(start,end);
			int num = show2(start,end);
			System.out.print(num+" ");
		}
	}

	private static int show2(int start, int end) {
		Random r = new Random();
		int num = r.nextInt(end-start+1)+start;
		return num;
	}

	private static int show(int start, int end) {
		
		return (int)(Math.random()*(end-start+1)+start);
	}

}
