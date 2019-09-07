package others;
/*
 *public final void setDaemon(boolean on):将该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，Java 虚拟机退出。 该方法必须在启动线程前调用
 */
public class DameonDemo {

	public static void main(String[] args) {
		Dameon d1 = new Dameon("关云长");
		Dameon d2 = new Dameon("飞");
		
		//在启动前调用，必须要有主线程
		d1.setDaemon(true);
		d2.setDaemon(true);
		d1.start();
		d2.start();
		
		Thread.currentThread().setName("刘备");
		for(int x=0;x<5;x++){
			System.out.println(Thread.currentThread().getName()+": "+x);
		}
	}

}
