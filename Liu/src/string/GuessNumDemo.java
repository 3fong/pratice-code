package string;

import java.util.Scanner;

public class GuessNumDemo {

	public static void main(String[] args) {		
		start();
	}
	public static void start(){		
		int robot = (int)(Math.random()*100)+1;
		
		while(true){
			Scanner s = new Scanner(System.in);
			System.out.println("请输入1-100之间的数：");
			int num = s.nextInt();
			
			if(num>robot){
				System.out.println("大了");
			}
			else if(num<robot){
				System.out.println("小了");
			}
			else{
				System.out.println("猜中了: "+robot);
				break;
			}
		}
	}
}
