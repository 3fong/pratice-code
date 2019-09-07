package thread;
/*
 *创建线程方式一：继承Thread类
 *		1 继承Thread类
 *		2 复写run方法
 *		3 创建对象
 *		4 调用start方法
 * 如何获取线程对象的名称呢?
 * public final String getName():获取线程的名称。
 * 如何设置线程对象的名称呢?
 * 方法一：public final void setName(String name):设置线程的名称
 * 方法二：构造函数
 * 针对不是Thread类的子类中如何获取线程对象名称呢?
 * public static Thread currentThread():返回当前正在执行的线程对象
 * Thread.currentThread().getName()
 */
public class ThreadDemo {

	public static void main(String[] args) {
//		MyThread mt1 = new MyThread();
//		MyThread mt2 = new MyThread();
//		
//		mt1.setName("曹操");
//		mt2.setName("孙权");
		
		MyThread mt1 = new MyThread("曹操");
		MyThread mt2 = new MyThread("孙权");
		mt1.start();
		mt2.start();
		
		for(int x=0;x<10;x++){
			//public static Thread currentThread():返回当前正在执行的线程对象
			System.out.println(Thread.currentThread().getName()+": "+x);
		}
	}

}
