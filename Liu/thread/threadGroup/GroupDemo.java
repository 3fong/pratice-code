package threadGroup;
/*
 *
 * 线程组： 把多个线程组合到一起。
 * 它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 * public final ThreadGroup getThreadGroup():获取线程组
 */
public class GroupDemo {

	public static void main(String[] args) {
//		method1();
		method2();
		
		for(int x=0;x<5;x++){
			System.out.println(Thread.currentThread().getName()+x);
		}
	}
	//对组操作，效果给予整个组中的线程
	private static void method2() {
		ThreadGroup tg = new ThreadGroup("天堂");
		
		MyRunnable mr = new MyRunnable();
		
		//Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg,mr,"林青霞");
		Thread t2 = new Thread(tg,mr,"刘意");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		tg.setDaemon(true);
		t1.start();
		t2.start();
	}

	private static void method1() {
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(mr,"林青霞");
		Thread t2 = new Thread(mr,"刘意");
		
		//获取线程组
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		//获取线程组名称
		String n1 = tg1.getName();
		String n2 = tg2.getName();
		System.out.println(n1);
		System.out.println(n2);
		
		//默认情况下，所有线程都属于同一组：main
		System.out.println(Thread.currentThread().getThreadGroup().getName());
//		t1.start();
//		t2.start();
	}

}
