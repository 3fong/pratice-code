package properties;

import java.util.Scanner;

/*
 *猜数字游戏
 */
public class GuessNum {
	private GuessNum(){}
	public static void start() {
		int num = (int)(Math.random()*100)+1;
		
		int count=0;
		while(num>0){
			Scanner s = new Scanner(System.in);
			System.out.println("请输入1-100间的数字");
			int my = s.nextInt();
			count++;
			if(my>num)
				System.out.println("大了");
			else if(my<num)
				System.out.println("小了");
			else{
				System.out.println("你用了："+count+"次猜中了");
				break;
			}				
		}		
	}
}
