package collection.map;

import java.util.HashMap;

/*
 *��ݷ�������ֵ����ȡ������ֵ
 */
public class GetWeekDemo {

	public static void main(String[] args) {
		String week = getWeek(2);
		String str = getMapWeek(week);
		System.out.println(str);
	}

	private static String getMapWeek(String week) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("����һ","Monday");
		hm.put("���ڶ�","TuesDay");
		
		return hm.get(week);
	}

	private static String getWeek(int i) {
		if (i > 7 && i < 0)
			throw new RuntimeException("�������");
		String[] weeks = {"","����һ","���ڶ�"};
		return weeks[i];
	}

}
