package new5;
/*
 *JDK1.8接口中可以定义默认权限和静态方法
 */
interface Inter1{
	public abstract void show();
	//默认权限
	public default void method(){
		System.out.println("默认");
	}
	//静态
	public static void method2(){
		System.out.println("jingtai");
	}
}
public class JDK8 {

	public static void main(String[] args) {
		//给匿名内部类赋值，方便调用方法
		Inter1 i = new Inter1(){
			public void show(){
				System.out.println("show");
			}
		};
		i.show();
		i.method();
		//调用静态
		Inter1.method2();
	}
}
