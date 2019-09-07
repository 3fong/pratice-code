package newFeatures;
/*
 *JDK1.8接口中可以定义默认权限和静态方法
 */
interface Inter{
	//抽象方法
	public abstract void show();
	
	//default方法
	public default void defaultPrint(){
		System.out.println("林青霞");
	}
	
	//static方法
	public static void staticPrint(){
		System.out.println("面北吹风--水一刀");
	}
}
class InterImpl implements Inter{
	public void show(){
		System.out.println("show");
	}
}
public class JDK8 {

	public static void main(String[] args) {
		Inter.staticPrint();
		
		//Inter.defaultPrint();//静态不能访问非静态
		Inter i = new InterImpl();
		i.show();
		i.defaultPrint();
	}

}
