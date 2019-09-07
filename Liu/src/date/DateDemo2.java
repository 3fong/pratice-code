package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *Date	 --	 String(格式化)
 * 		public final String format(Date date)
 * String -- Date(解析)
 * 		public Date parse(String source)
 */
public class DateDemo2 {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		SimpleDateFormat sd = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//将日期转为字符串
		String str = sd.format(d);
		System.out.println(str);
		
		String s = "2008-08-08 12:15:45";
		
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1 = sdf.parse(s);
		System.out.println(d1);
	}

}
