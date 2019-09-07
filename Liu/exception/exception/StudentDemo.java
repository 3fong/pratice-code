package exception;
import java.util.Scanner;

/*
 *测试自定义异常
 */
public class StudentDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int scord = s.nextInt();
		
		Teacher t = new Teacher();
		try{
			t.check(scord);
		}catch(MyException me){
			me.printStackTrace();
		}
		s.close();
	}

}
