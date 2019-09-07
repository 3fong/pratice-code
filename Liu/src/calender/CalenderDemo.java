package calender;

import java.util.Calendar;
import java.util.Scanner;

/*
 *Calendar Calendar.getInstance():获取日历。
 *set(年,月,日):设置时间
  get(Calendar.YEAR):获取年
  add(int field,int amount):依据日历规则，为指定日历字段指定
 	需求：获取任意一年的二月有多少天
 	分析：
 		获取当月天数可以通过下个月初-1天就是当月天数
 */
public class CalenderDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);
		c.add(Calendar.DATE,-1);
		System.out.println(c.get(Calendar.DATE));
	}

}
