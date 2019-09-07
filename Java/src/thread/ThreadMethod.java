package thread;
/*
 * 线程的方法：
 *join()：加入线程。相当于插队。作用：用来临时加入线程执行。
 *yield():礼让线程。暂停当前正在执行的线程对象，并执行其他线程。
 *优先级：代表抢cpu资源的频率。 setPriority():设置线程优先级。
 *	MAX_PRIORITY MIN_PRIORITY NORM_PRIORITY
 *setDaemon():后台线程。必须在启动线程前调用。主线程结束，它也结束。
 */
class Method implements Runnable{
	public void run(){
		for(int x=0;x<50;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
//			Thread.yield();
		}
	}
}
public class ThreadMethod {

	public static void main(String[] args) throws InterruptedException {
		Method m = new Method();
		Thread t1 = new Thread(m,"张包");
		Thread t2 = new Thread(m,"关小兴");
		Thread t3 = new Thread(m,"司马---师");
//		t1.setPriority(Thread.MIN_PRIORITY);
//		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
//		t1.join();
		t2.start();
		t3.start();
		
		Thread.currentThread().setName("常山赵子龙");
		for(int x=0;x<4;x++){
			System.out.println(Thread.currentThread().getName()+"---"+x);
		}
	}

}
