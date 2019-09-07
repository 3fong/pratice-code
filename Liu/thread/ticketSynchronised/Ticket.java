package ticketSynchronised;
/*
 *加入线程休眠 
 *	同步机制运行原理 可以看成上厕所
 */
public class Ticket implements Runnable {
	private int ticket=100;
	Object o = new Object();
	public void run(){
		while(true){
					//-->t1 -->t2 -->t3 三个线程在这里会会进行判读，假设t1先进去
					//C:t1休眠时，t2和t3会抢夺执行权，无论它们谁获取执行权，因为锁门，都无法进去。F：三个线程重新抢夺执行权
			synchronized(o){//-->A:t1 进入，锁门
				if(ticket>0){
					try {
						Thread.sleep(10);//B:t1在这里休眠10毫秒，丧失执行权 
											//D：t1休眠结束重获得执行权，会继续向下执行
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+":在售第："+(ticket--)+"张票");
				}//E:t1执行结束，开门出去。
			}
		}
	}
}
