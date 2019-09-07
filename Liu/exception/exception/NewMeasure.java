package exception;
/*
 *JDK7出现了一个新的异常处理方案：
 * 		try{
 * 
 * 		}catch(异常名1 | 异常名2 | ...  变量 ) {
 * 			...
 * 		}
 * 
 * 		注意：这个方法虽然简洁，但是也不够好。
 * 			A:处理方式是一致的。(实际开发中，好多时候可能就是针对同类型的问题，给出同一个处理)
 *			B:多个异常间必须是平级关系。
 */
public class NewMeasure {

	public static void main(String[] args) {
		show();
	}
	public static void show(){
		int a = 10;
		int b = 0;
		int [] arr = {0,1,2};
		
		try{
			System.out.println("a/b:"+a/b);
			System.out.println("arr[3]:"+arr[3]);
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("数据异常");
		}
		System.out.println("over");
	}
}
