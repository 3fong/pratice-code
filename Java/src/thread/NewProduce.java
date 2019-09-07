package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 线程间通信--例题：生产者和消费者
 *JDK1.5中提供了多线程升级解决方案：
a、用实现Lock代替同步synchronized操作；
b、用Condition对象替换wait、notify、notifyAll方法。它通过Lock锁进行获取。
	格式：Condition c = Lock.newCondition();
 */
class Res3{
	private String name;
	private int count;
	private boolean flag=false;
	//创建锁
	private ReentrantLock lock = new ReentrantLock();
	private Condition c_pro = lock.newCondition();
	private Condition c_con = lock.newCondition();
	public void set(String name) throws InterruptedException{
		try{
			lock.lock();
			while(flag){
				c_pro.await();
			}
			this.name=name+":"+count++;
			System.out.println(Thread.currentThread().getName()+"生产者"+this.name);
			flag=true;
			c_con.signal();
		}finally{
			lock.unlock();
		}
	}
	public void get() throws InterruptedException{
		try{
			lock.lock();
			while(!flag){
				c_con.await();
			}
			System.out.println(Thread.currentThread().getName()+"::消费者::"+this.name);
			flag=false;
			c_pro.signal();
		}finally{
			lock.unlock();
		}
	}
}
class Produce1 implements Runnable{
	private Res3 r;
	Produce1(Res3 r){
		this.r=r;
	}
	public void run(){
		while(true){
			try{
				r.set("油条");
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
class Consumer1 implements Runnable{
	private Res3 r;
	Consumer1(Res3 r){
		this.r=r;
	}
	public void run(){
		while(true){
			try{
				r.get();
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
public class NewProduce {

	public static void main(String[] args) {
		Res3 r = new Res3();
		Produce1 p = new Produce1(r);
		Consumer1 c = new Consumer1(r);
		
		new Thread(p).start();
		new Thread(c).start();
	}

}
