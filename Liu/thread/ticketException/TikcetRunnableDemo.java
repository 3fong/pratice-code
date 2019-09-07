package ticketException;
/*
 *实现Runnable接口的方法
 *	加入线程休眠后产生了问题：
 *A:相同的票卖了多次
 * 		CPU的一次操作必须是原子性的
 * B:出现了负数票
 * 		随机性和延迟导致的
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
