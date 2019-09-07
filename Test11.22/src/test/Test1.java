package test;

import java.util.Scanner;

/*
 * 键盘录入：
 * import java.util.Scanner;
 * 格式：
 * Scanner s = new Scanner(System.in);
 * int x = s.nextInt();
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		if(x<0 || x>100){
			System.out.println("不合规");
		}
		else if(x>=90 && x<=100){
			System.out.println("优");
		}
		else if(x>=80 && x<90){
			System.out.println("好");
		}
		else if(x>=70 && x<80){
			System.out.println("良");
		}
		else if(x>=60 && x<70){
			System.out.println("合格");
		}
		else{
			System.out.println("不合格");
		}
	}
}
