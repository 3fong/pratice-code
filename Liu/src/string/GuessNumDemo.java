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
			System.out.println("������1-100֮�������");
			int num = s.nextInt();
			
			if(num>robot){
				System.out.println("����");
			}
			else if(num<robot){
				System.out.println("С��");
			}
			else{
				System.out.println("������: "+robot);
				break;
			}
		}
	}
}
