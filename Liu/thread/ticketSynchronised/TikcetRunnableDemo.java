package ticketSynchronised;
/*
 *加入延时后程序出现问题，
 *多线程可能产生问题因素：
 * A:是否是多线程环境
 * B:是否有共享数据
 * C:是否有多条语句操作共享数据
 * 针对上面因素，我们只能改变C。java提供了同步机制解决数据共享问题
 *同步代码块：
 * 		synchronized(对象){
 * 			需要同步的代码;(共享数据)
 * 		}
 * 	注意：
 * 		同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
 * 		多个线程必须是同一把锁
 * 同步的加入会明显感觉到运行速度的降低。安全和效率是程序员的终生问题。
 */
public class TikcetRunnableDemo {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t,"贸");
		Thread t2 = new Thread(t,"直门");
		Thread t3 = new Thread(t,"奥林匹克");
		t1.start();
		t2.start();
		t3.start();
	}

}
