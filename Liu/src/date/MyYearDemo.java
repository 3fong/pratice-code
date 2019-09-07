package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *��һ��������������������?
 *������
 * 		A:����¼����ĳ�����������
 * 		B:�Ѹ��ַ���ת��Ϊһ������
 * 		C:ͨ�������ڵõ�һ������ֵ
 * 		D:��ȡ��ǰʱ��ĺ���ֵ
 * 		E:��D-C�õ�һ������ֵ
 * 		F:��E�ĺ���ֵת��Ϊ��
 * 			/1000/60/60/24
 */
public class MyYearDemo {

	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		String year = s.nextLine();
			
		SimpleDateFormat sd = 
				new SimpleDateFormat("yyyy-MM-dd");
		Date d = sd.parse(year);
		
		long myTime = d.getTime();
		long nowTime = System.currentTimeMillis();
		long time = (nowTime-myTime);
		long time2 = time/1000/60/60/24;
		System.out.println(time2);
	}

}
