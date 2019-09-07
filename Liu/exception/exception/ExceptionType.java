package exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *异常的分类
 * 编译时异常：必须要处理的异常，否则无法通过编译 class ParseException extends Exception {
 * 运行时异常：编译时可以不处理异常
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
