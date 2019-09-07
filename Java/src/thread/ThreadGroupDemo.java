package thread;
/*
 *线程组： 把多个线程组合到一起。
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 * public final ThreadGroup getThreadGroup():获取线程组
 * 默认情况下，所有线程都属于同一组：main
 */
class MyRunnable implements Runnable {
	public void run(){
		for(int x=0;x<150;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
public class ThreadGroupDemo {

	public static void main(String[] args) {		
		method1();
		for(int x=0;x<4;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
	private static void method1() {
		ThreadGroup tg = new ThreadGroup("天堂");
		MyRunnable mr = new MyRunnable();
		//Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg,mr,"Linqingxia");
		Thread t2 = new Thread(tg,mr,"江别鹤");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		tg.setDaemon(true);
		t1.start();
		t2.start();
	}
}
