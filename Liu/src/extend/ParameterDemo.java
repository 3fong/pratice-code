package extend;
/*
 * 形式参数：
 * 		类名：需要类的对象；
 * 		抽象类：需要该类子类对象
 * 		接口：需要实现该接口的类对象
 */
interface Fu2{
	void show2();
}
abstract class Fu1{
	public abstract void show();
} 
class FuDemo{
	public void method(Fu1 f){
		f.show();
	}
	public void method2(Fu2 f2){
		f2.show2();
	}
}
class Zi1 extends Fu1 implements Fu2{
	public void show(){
		System.out.println("好的");
	}
	public void show2(){
		System.out.println("非常好的");
	}
}
public class ParameterDemo {

	public static void main(String[] args) {
		FuDemo fd = new FuDemo();
		Fu1 f = new Zi1();
		fd.method(f);
		
		Fu2 f2 = new Zi1();
		fd.method2(f2);
	}

}
