package extend;
/*
 * 抽象类本身无法实例化，它通过多态方式由子类实例化
 *abstract不能和哪些关键字共存?
	private	冲突
	final	冲突	
	static	无意义
	这里的共存值在一个语句中同时使用。 
 */
abstract class Animal1{
	private static int num = 10;
	public abstract void show();
	public static int getNum(){
		return num;
	}
}
abstract class Ca1t extends Animal1{}

class Dog1 extends Animal1{
	public void show(){
		System.out.println("kongfu");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Animal1 a = new Dog1();
		a.show();
		int num = a.getNum();
		System.out.println(num);
	}

}
