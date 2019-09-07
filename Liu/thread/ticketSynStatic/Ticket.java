package ticketSynStatic;
/*
 *加入线程休眠 
 *	同步机制运行原理 可以看成上厕所
 */
public class Ticket implements Runnable {
	//因为静态方法中要使用成员变量，必须要给成员变量加入静态
	private static int ticket=100;
	Object o = new Object();
	private int x=0;
	public void run(){
		while(true){
			if(x%2==0){
				//同步代码块的锁是任意对象，但是要与其他同步方式一起使用时要保证锁的一致性
				synchronized(Ticket.class){
					if(ticket>0){
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {					
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+":在售第："+(ticket--)+"张票");
					}
				}
			}else{
				sellTicket();
			}
			x++;
		}
	}
	//同步函数的锁是this
//	private synchronized void sellTicket() {
//		if(ticket>0){
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {				
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+":在售第："+(ticket--)+"张票");
//		}
//	}
	//静态同步方法的锁是字节码文件
	private static synchronized void sellTicket() {
		while(true){
			if(ticket>0){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":在售第："+(ticket--)+"张票");
			}
		}
	}
}
