package ticketRunnable;
/*
 *实现Runnable接口的方法
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
