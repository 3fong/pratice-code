package lock;
/*
 *同步的弊端：
 * 		A:效率低
 * 		B:容易产生死锁
 * 死锁：
 * 		两个或两个以上的线程在争夺资源的过程中，发生的一种相互等待的现象。
 */
public class DieLockDemo {

	public static void main(String[] args) {
		DieLock d1 = new DieLock(true);
		DieLock d2 = new DieLock(false);
//		Thread t1 = new Thread(d,"true");
//		Thread t2 = new Thread(d,"false");
		
		d1.start();
		d2.start();
	}

}
