package base;

import java.util.Scanner;

/*
 *if语句和switch语句的用法
 */
public class IfAndSwitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
//		getSeason(num);
		getWeek(num);
	}
	public static void getSeason(int num){
		if(num<=0 || num >12){
			System.out.println("没有这个月份！");
		}else if(num>=3 && num<=5){
			System.out.println(num+": is Spring!");
		}else if(num>=6 && num<=8){
			System.out.println(num+": is Summer!");
		}else if(num>=9 && num<=11){
			System.out.println(num+": is Fall!");
		}else{
			System.out.println(num+": is Winter!");
		}
	}
	public static void getWeek(int num){
		switch(num){
			case 1 :
				System.out.println("Monday");
				break;
			case 2 :
				System.out.println("Tuesday");
				break;
			case 3 :
				System.out.println("Wednesday");
				break;
			case 4 :
				System.out.println("Thursday");
				break;
			case 5 :
				System.out.println("Friday");
				break;
			case 6 :
				System.out.println("Saturday");
				break;
			case 7 :
				System.out.println("Sunday");
				break;
			default:
				System.out.println("你输入的数据有误");	
		}
	}
}
