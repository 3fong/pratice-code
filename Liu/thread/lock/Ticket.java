package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 *JDK1.5������ Lock
 */
public class Ticket implements Runnable {
	private int ticket=100;
	//����������
	private Lock lock = new ReentrantLock();
	public void run(){
		while(true){
			try{
				lock.lock();
				if(ticket>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().
							getName()+":���۵ڣ�"+(ticket--)+"��Ʊ");
				}
			}finally{
				lock.unlock();
			}
		}
	}
}
