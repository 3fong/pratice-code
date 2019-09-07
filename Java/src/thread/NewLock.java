package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 *
 */
class Res4{
	private String name;
	private int count;
	private boolean flag = false;
	private ReentrantLock lock = new ReentrantLock();
	private Condition c_pro = lock.newCondition();
	private Condition c_con = lock.newCondition();
	public void set(String name) throws InterruptedException{
		lock.lock();
		try{
			while(flag){
				c_pro.await();
			}
			this.name=name+"...."+count++;
			System.out.println(Thread.currentThread().getName()+":生产::"+this.name);
			flag=true;
			c_con.signal();
		}finally{
			lock.unlock();
		}
	}
	public void get() throws InterruptedException{
		lock.lock();
		try{
			while(!flag)
				c_con.await();
			System.out.println(Thread.currentThread().getName()+":我买 我买---"+this.name);
			flag=false;
			c_pro.signal();
		}finally{
			lock.unlock();
		}
	}
}
class Produce4 implements Runnable{
	private Res4 r;
	public Produce4(Res4 r) {
		super();
		this.r = r;
	}
	public void run(){
		while(true){
			try {
				r.set("金枪鱼");
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
class Consumer4 implements Runnable{
	private Res4 r;
	public Consumer4(Res4 r) {
		super();
		this.r = r;
	}
	public void run(){
		while(true){
			try {
				r.get();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}		
	}
}
public class NewLock {

	public static void main(String[] args) {
		Res4 r = new Res4();
		Produce4 p = new Produce4(r);
		Consumer4 c = new Consumer4(r);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(p);
		Thread t4 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
