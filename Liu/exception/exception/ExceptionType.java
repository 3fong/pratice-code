package exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *�쳣�ķ���
 * ����ʱ�쳣������Ҫ������쳣�������޷�ͨ������ class ParseException extends Exception {
 * ����ʱ�쳣������ʱ���Բ������쳣
 */
public class ExceptionType {

	public static void main(String[] args) {
		String s = "2012-12-23";
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date d = sd.parse(s);
		try{
			Date d = sd.parse(s);
			System.out.println(d);
		}catch(ParseException e){
			e.printStackTrace();
//			System.out.println(e);
		}
		
	}

}
