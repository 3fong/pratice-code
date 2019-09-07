package extend;
/*
 * 匿名内部类面试题：
 * 	按要求，补齐代码：
 * 	interface Inter{void show();}
 * 	class Outer{//补齐代码}
 * 	class OuterDemo{
 * 		public static void main(String[] args){
 * 			Outer.method().show();
 * 		}
 * 	}
 * 要求在控制台输出"helloworld";
 */
/*
interface Inter{void show();}
class Outer{
	public static Super2 method(){
		return new Super2();
	}	
}
class Super2 implements Inter{
	public void show(){
		System.out.println("helloworld");
	}
}
*/
interface Inter{void show();}
class Outer{
	public static Inter method(){
		return new Inter(){
			public void show(){
				System.out.println("helloworld");
			}
		};
	}
}
public class NiMingDemo {

	public static void main(String[] args) {
	 	 Outer.method().show();
	 	 
	 	/*
	 	 *  思路：
	 	 *  1 方法由类名调用，这个方法为静态方法；
	 	 *  2 方法由方法调用，调用方法的返回值类型为方法的对象。
	 	 */
	 	 
	}

}
