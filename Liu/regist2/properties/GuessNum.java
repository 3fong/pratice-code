package properties;

import java.util.Scanner;

/*
 *��������Ϸ
 */
public class GuessNum {
	private GuessNum(){}
	public static void start() {
		int num = (int)(Math.random()*100)+1;
		
		int count=0;
		while(num>0){
			Scanner s = new Scanner(System.in);
			System.out.println("������1-100�������");
			int my = s.nextInt();
			count++;
			if(my>num)
				System.out.println("����");
			else if(my<num)
				System.out.println("С��");
			else{
				System.out.println("�����ˣ�"+count+"�β�����");
				break;
			}				
		}		
	}
}
