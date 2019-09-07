package date;

import java.util.Date;

/*
 * public long getTime():获取时间，以毫秒为单位
 * public void setTime(long time):设置时间
 * 
 * 从Date得到一个毫秒值
 * 		getTime()
 * 把一个毫秒值转换为Date
 * 		构造方法
 * 		setTime(long time)
 */
public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		
		long time = d.getTime();
		System.out.println(time);
		
		d.setTime(100000000);
		System.out.println(d);
	}

}
