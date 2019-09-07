package collection.tools;

import java.util.Calendar;

/*
 *Calendar��
	������һ�������࣬��Ϊ�ض�ʱ����һ������YREA��MONTH��DAY_OF_MONTH��HOUR�������ֶ�֮���ת��
	�ṩ��һЩ��������Ϊ���������ֶ��ṩ��һЩ������
	Calendar Calendar.getInstance():��ȡ����
	set(��,��,��):����ʱ��
	get(Calendar.YEAR):��ȡ��
	add(int field,int amount):�����������Ϊָ�������ֶ�ָ����ӻ��ȥָ����ʱ������
 */
public class CalendarDemo {

	public static void main(String[] args) {
		getEeYue();
	}

	// ��ȡ������Ķ����ж�����
	private static void getEeYue() {
		Calendar c = Calendar.getInstance();
		c.set(2015, 2, 1);// �Ǳ��0��ʼ�����������ڽǱ�2��λ�ã�ϵͳĬ��Ҳ��0���һ��
		c.add(Calendar.DAY_OF_MONTH, -1);
		getCalendar(c);
	}

	private static void getCalendar(Calendar c) {
		String[] mons = { "һ��", "����", "����", "����", "����", "����", "����", "����", "����", "ʮ��", "ʮһ��", "ʮ����" };
		int index = c.get(Calendar.MONTH);
		// ��ȡ����
		sop(c.get(Calendar.YEAR));		
		sop(mons[index]);//sop(c.get(Calendar.MONTH));
		sop(c.get(Calendar.DAY_OF_MONTH));
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
