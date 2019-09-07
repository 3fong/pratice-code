package thread;
/*
 *创建线程第二种方式：实现Runnable接口
 * 步骤：
 * 		A:自定义类MyRunnable实现Runnable接口
 * 		B:重写run()方法
 * 		C:创建MyRunnable类的对象
 * 		D:创建Thread类的对象，并把C步骤的对象作为构造参数传递
 */
public class MyRunnableDemo {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		
		//Thread(Runnable target, String name)，可以在参数列表设置名称
		Thread t1 = new Thread(mr,"江别鹤");
		Thread t2 = new Thread(mr,"鱼");
		t1.start();
		t2.start();
	}

}
