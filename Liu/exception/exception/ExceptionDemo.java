package exception;
/*
 *两个异常的处理
 *try语句中，当语句内出现异常时，后面语句会执行不到
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int [] arr = {0,1,2};
		
		try{
			System.out.println("a/b:"+a/b);
			System.out.println("arr[3]:"+arr[3]);
		}catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		}
		System.out.println("over");
	}

}
