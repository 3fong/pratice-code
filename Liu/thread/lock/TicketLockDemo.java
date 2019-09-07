package lock;
/*
 *虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁，
 * 为了更清晰的表达如何加锁和释放锁,JDK5以后提供了一个新的锁对象Lock。
 * 
 * Lock：
 * 		void lock()： 获取锁。
 * 		void unlock():释放锁。  
 * ReentrantLock是Lock的实现类.
 * Lock lock = new ReentrantLock();
 */
public class TicketLockDemo {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		Thread t1 = new Thread(t,"刘");
		Thread t2 = new Thread(t,"孙尚香");
		t1.start();
		t2.start();
	}

}
