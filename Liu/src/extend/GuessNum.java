package extend;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		
		while(true){
			Scanner s = new Scanner(System.in);		
			int MyNum = s.nextInt();
			
			if(MyNum>num){
				System.out.println("大了");
			}
			else if(MyNum<num){
				System.out.println("小了");
			}
			else{
				System.out.println("中了");
				break;
			}

		}
	}

}
