package regex;

import java.util.Scanner;

/*
 *分割功能
 *		String类的public String[] split(String regex)
 *		根据给定正则表达式的匹配拆分此字符串。 
 *		搜索好友
 * 			性别：女
 * 			范围："18-24"
 * 		age>=18 && age<=24
 */
public class SplitString {

	public static void main(String[] args) {
		String age = "18-24";
		String regex = "-";
		
		String[] strArray = age.split(regex);
//		for(int x=0;x<strArray.length;x++){
//			System.out.println(strArray[x]);
//		}
		//将字符串转成int
		int young = Integer.parseInt(strArray[0]);
		int old = Integer.parseInt(strArray[1]);
		
		Scanner s = new Scanner(System.in);
		int age1 = s.nextInt();
		
		if(age1>=young && age1<=old){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
