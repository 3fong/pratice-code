package exception;
/*
 *自定义异常：定义java未定义的异常
 *throw和throws的区别：
 *位置不同：方法中，方法声明上
 *格式不同：仅能抛出一个异常对象；可抛出多个异常类，用逗号隔开
 *发生可能性不同：一定会发生；可能会发生
 *处理不同：自己处理；抛给调用者处理
 */
class ChushuException extends Exception{
	private int value;
	
	public ChushuException() {
		super();	
	}
	ChushuException(String msg,int value){
		 super(msg);
		 this.value = value;
	 }
	 public int getValue(){
		 return value;
	 }
}
public class MyException {
	public int div(int a,int b) throws ChushuException{
		if(b<=0){
			throw new ChushuException("除数不合规",b);
		}
		return a/b;
	}
	public static void main(String[] args) {
		MyException me = new MyException();
		try{			
			int a = me.div(5, 0);
			System.out.println(a);
		}catch(ChushuException ce){
			System.out.println(ce.toString());
			System.out.println("除数出现负数了");	
		}
		System.out.println("over");
	}

}
