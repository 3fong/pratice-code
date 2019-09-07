package exception;
/*
 *2:如果catch里面有return语句，请问finally里面的代码还会执行吗?
 *   如果会，请问是在return前，还是return后。
 * 	   会。前。
 * 
 * 	 准确的说，应该是在中间。
 */
public class FinalDemo {

	public static void main(String[] args) {
		System.out.println(show());
	}
	public static int show(){
		int a = 23;
		int b=0;
		try{
			System.out.println(a/b);
			a=20;//执行不到
		}catch(Exception e){
			a = 30;
			
			/*
			 * return a在程序执行到这一步的时候，这里不是return a而是return 30;这个返回路径就形成了。
			 * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
			 * 再次回到以前的返回路径，继续走return 30;
			 */
			return a;
		}finally{
			a=40;
//			return a;
		}
		return a;
	}
}
