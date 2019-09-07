package extend;
/*
 * 返回值类型：
 * 	引用类型
 * 		类名：需要该类的对象；
 * 		抽象类：需要该类子类的对象；
 * 		接口：需要实现接口的类对象；
 */
interface Extra{
	public abstract void show();
}
abstract class Person4{
	public abstract void show1();
}
class PersonDemo{
	public Person4 getPerson4(){
//		无法直接创建抽象类对象
//		return new Person4();
		return new Teacher();
	}
	public static Extra getExtra(){
		return new Teacher();
	}
}
class Teacher extends Person4 implements Extra{
	public void show1(){
		System.out.println("上课了");
	}
	public void show(){
		System.out.println("抽烟了");
	}
}
public class ReturnDemo {

	public static void main(String[] args) {
		//静态调用方法，因为返回值为一个对象，所以可以调用其方法。
		PersonDemo.getExtra().show();
		
		//匿名对象方式，调用方法。用了链式编程，就是方法的返回值是对象，可以再次调用方法。
		new PersonDemo().getExtra().show();
		
		PersonDemo pd = new PersonDemo();
		Person4 p = pd.getPerson4();
		p.show1();
	}

}
