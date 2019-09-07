package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *这是日期和字符串转换工具类
 *@author David
 */
public class DateUtil {
	private DateUtil(){}
	/**
	 * 这个方法的作用就是把日期转成字符串
	 * @param d	被转换的日期对象
	 * @param format 要被转换的格式
	 * @return 格式化后的字符串
	 */
	public static String dateToString(Date d,String format){
		return new SimpleDateFormat(format).format(d);
	}
	/**
	 * 这个方法的作用是将字符串转为日期
	 * @param s 被解析的字符串
	 * @param format 要转换成的格式
	 * @return 解析后的日期
	 * @throws ParseException 
	 */
	public static Date stringToDate(String s,String format) throws ParseException{
		return new SimpleDateFormat(format).parse(s);
	}
}
