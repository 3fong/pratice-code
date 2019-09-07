package faceObject;
/*
 *匿名内部类：是局部内部类的简化形式，用于少量次数调用的情形。
 *1 匿名内部类其实就是内部类的简写格式
	2 定义匿名内部类的前提：
		内部类必须是继承一个类或实现接口。
	3 匿名内部类的格式： new 父类或接口(){定义子类的内容}
 */
abstract class Fu1{
	public abstract void play();
}
class Outer1{
	int x=10;
	public void show(){
		System.out.println("i like u");
	}
	class Inner extends Fu1{
		public void play(){
			System.out.println("play:"+x);
		}
	}
	//匿名内部类定义在局部
	public void function(){
		new Fu1(){
			public void play(){
				System.out.println("i like u, too");
			}
		}.play();
	}
}
public class InnerClassNiMing {

	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.show();
		Outer1.Inner oi = o.new Inner();
		oi.play();
		o.function();
	}

}
