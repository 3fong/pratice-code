package exception;
/*
 *Throwable中的方法：
	getMessage():获取异常信息，返回String；
	toString():异常名称和异常信息，返回String；
	printStackTrace():获取异常名称、信息和出现的位置。它是JVM默认方法。
	printStackTrace(PrintStream s)：通常用该方法将异常内容保存在日志文件中

，以便查阅。
 */
public class MethodDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try{
			System.out.println("a/b:"+a/b);
		}catch(Exception e){
//			System.out.println(e);
//			e.getMessage(); 
//			System.out.println("e.getMessage():"+e.getMessage());// / by zero
			
//			System.out.println(e.toString());//java.lang.ArithmeticException: / by zero
			
			e.printStackTrace();	//java.lang.ArithmeticException: / by zero
									//at MethodDemo.main(MethodDemo.java:15)
		}
		System.out.println("over");
	}

}
