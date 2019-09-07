package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 1.5新特性：将Lock代替了synchronized；
 * 将Condition中的await()、signal()、signalAll()替代了wait()、notify()、notifyAll()；
 */

class Resource1{
	private String name;
	private int count;
	private boolean flag=false;
	private Lock lock = new ReentrantLock();
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();
	
	public void get(String name) throws InterruptedException{
		lock.lock();
		try{
			while(flag)
				condition_pro.await();
			this.name=name+"...."+count++;
			System.out.println(Thread.currentThread().getName()+"生产者"+this.name);
			flag=true;
			condition_con.signal();
		}
		finally{
			lock.unlock();
		}
		
	}
	public void out()throws InterruptedException{
		lock.lock();
		try{
			while(!flag)
				condition_con.await();
			System.out.println(Thread.currentThread().getName()+this.name+"。。。消费者");
			flag=false;
			condition_pro.signal();
			
		}
		finally{
			lock.unlock();
		}
		
	}
}
class Producer1 implements Runnable {
	private Resource1 r;
	Producer1(Resource1 r){
		this.r=r;
	}
	public void run(){
		while(true){
			try {
				r.get("商品");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class Consumer1 implements Runnable{
	private Resource1 r;
	Consumer1(Resource1 r){
		this.r=r;
	}
	public void run(){
		while(true){
			try {
				r.out();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class ProConLock {

	public static void main(String[] args) {
		Resource1 r = new Resource1();
		
		new Thread(new Producer1(r)).start();
		new Thread(new Consumer1(r)).start();
	}

}
