package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *�������ں��ַ���ת��������
 *@author David
 */
public class DateUtil {
	private DateUtil(){}
	/**
	 * ������������þ��ǰ�����ת���ַ���
	 * @param d	��ת�������ڶ���
	 * @param format Ҫ��ת���ĸ�ʽ
	 * @return ��ʽ������ַ���
	 */
	public static String dateToString(Date d,String format){
		return new SimpleDateFormat(format).format(d);
	}
	/**
	 * ��������������ǽ��ַ���תΪ����
	 * @param s ���������ַ���
	 * @param format Ҫת���ɵĸ�ʽ
	 * @return �����������
	 * @throws ParseException 
	 */
	public static Date stringToDate(String s,String format) throws ParseException{
		return new SimpleDateFormat(format).parse(s);
	}
}
