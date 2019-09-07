package date;

import java.text.ParseException;
import java.util.Date;

/*
 *
 */
public class DateUtilDemo {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		String s = DateUtil.dateToString(d, "yyyy-MM-dd");
		System.out.println(s);
		
		String s1 = "2014-1-12";
		Date d1 = DateUtil.stringToDate(s1,"yyyy");
		System.out.println(d1);
	}

}
