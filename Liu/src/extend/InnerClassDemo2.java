package extend;
//内部类修饰符
class Outer2{
	//私有修饰内部类
	private class Inner2{
		public void show(){
			System.out.println("心脏");
		}
	}
	public void method(){
		Inner2 i = new Inner2();
		i.show();
	}
	//静态修饰内部类
	public static class Inner3{
		public void show(){
			System.out.println("非静态内部类方法");
		}
		public static void show1(){
			System.out.println("静态内部类方法");
		}
	}
}
public class InnerClassDemo2 {

	public static void main(String[] args) {
		//私有修饰，外部其他类无法直接创建对象
//		Outer2.Inner2 oi = new Outer2().new Inner2();
//		oi.show();
		
		Outer2 o = new Outer2();
		o.method();
		
		//静态修饰内部类的访问方式，此时内部类可以看出是成员方法。
		Outer2.Inner3 oi3 = new Outer2.Inner3();
		oi3.show();
		oi3.show1();
		
		//静态用类名直接调用
		Outer2.Inner3.show1();
	}

}
