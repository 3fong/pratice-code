package extend;
//匿名内部类的调用
interface Inner6{
	public abstract void show();
	public abstract void show1();
}
public class InnerClassDemo4 {

	public static void main(String[] args) {
		new Inner6(){
			public void show(){
				System.out.println("高效");
			}
			public void show1(){
				System.out.println("搞笑");
			}
		}.show();
		new Inner6(){
			public void show(){
				System.out.println("高效");
			}
			public void show1(){
				System.out.println("搞笑");
			}
		}.show1();
		
		//可用起名字的方式多次调用匿名内部类
		Inner6 i = new Inner6(){
			public void show(){
				System.out.println("高效");
			}
			public void show1(){
				System.out.println("搞笑");
			}
		};
		i.show();
		i.show1();
		
	}

}
