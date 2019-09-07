package collection.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *��Date��DateFormat��
	A:���췽��
		Date()
		Date(long time)
	B:��Ա����
		getTime()
		setTime(long time)
	���ڶ���ͺ���ֵ���ת����
	a ����ֵ-->���ڶ��� new Date(); setTime();
	b ���ڶ���-->����ֵ getTime();
	c �����ڶ�����и�ʽ����
	ʹ��SimpleDateFormat����и�ʽ��ƣ�������format()������ʽ�����ڡ�
 */
public class DateMethodDemo {

	public static void main(String[] args) throws ParseException {
//		 toDate();
//		toMiao();
		formatTime();
	}

	private static void formatTime() throws ParseException {
		Date d = new Date();
		SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//������ת���ַ�
		String s = sfd.format(d);
		
		//���ַ�ת������ 	ע��Ҫ��SimpleDateFormat��ʽ��Ӧ
		String str = "1111-11-11 11:1:11";
		Date d1 = sfd.parse(str);
		sop(d1);
	}

	// ����ֵ-->���ڶ��� new Date(); setTime();
	private static void toDate() {
		Date d = new Date();
		Date d1 = new Date(156451213456L);

		d.setTime(1234561513132L);
		sop(d);
	}

	// ���ڶ���-->����ֵ getTime();
	private static void toMiao() {
		Date d = new Date();
		long num = d.getTime();
		sop(num);
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
