package calender;

import java.util.Calendar;
import java.util.Scanner;

/*
 *Calendar Calendar.getInstance():��ȡ������
 *set(��,��,��):����ʱ��
  get(Calendar.YEAR):��ȡ��
  add(int field,int amount):������������Ϊָ�������ֶ�ָ��
 	���󣺻�ȡ����һ��Ķ����ж�����
 	������
 		��ȡ������������ͨ���¸��³�-1����ǵ�������
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
