package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
 * �̼߳�ͨ��--���⣺�����ߺ�������
 *JDK1.5���ṩ�˶��߳��������������
a����ʵ��Lock����ͬ��synchronized������
b����Condition�����滻wait��notify��notifyAll��������ͨ��Lock�����л�ȡ��
	��ʽ��Condition c = Lock.newCondition();
 */
class Res3{
	private String name;
	private int count;
	private boolean flag=false;
	//������
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
			System.out.println(Thread.currentThread().getName()+"������"+this.name);
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
			System.out.println(Thread.currentThread().getName()+"::������::"+this.name);
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
				r.set("����");
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
