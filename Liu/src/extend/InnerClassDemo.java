package extend;

class Outer1{
	private int num =10;
	class Inner{
		public void show(){
			System.out.println(num);	
		}
	}
	public void method(){
//		new Inner().show();
		Inner i = new Inner();
		i.show();
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer1.Inner oi = new Outer1().new Inner();
		oi.show();
	}
}
