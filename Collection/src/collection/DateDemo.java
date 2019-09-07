package collection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat s = new SimpleDateFormat("yyyyÄêMMÔÂdÈÕE hh:mm:ss");
		String time = s.format(d);
		System.out.println(time);
	}

}
