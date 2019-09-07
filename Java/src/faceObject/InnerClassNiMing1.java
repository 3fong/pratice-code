package faceObject;
/*
 *匿名内部类面试题：
	按照要求，补齐代码
		interface Inter { void show(); }
		class Outer { //补齐代码 }
		class OuterDemo {
			public static void main(String[] args) {
				  Outer.method().show();
			  }
		}
		要求在控制台输出”HelloWorld”
 */
interface Inter{
	void show();
}
class Outer2{
	public static Inter method(){
		return new Inter(){
			public void show(){
				System.out.println("helloworld");
			}
		};
	}
}
public class InnerClassNiMing1 {

	public static void main(String[] args) {
		/*
		 * 分析：类名直接调用方法，此方法为静态
		 * 	链式调用：前一个方法返回值是一个对象
		 * show()是接口的方法，接口无法创建对象，
		 * 所以实际返回值是其实现类对象。这里可以用匿名内部类简写
		 */
		Outer2.method().show();
	}
}
