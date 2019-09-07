package thread;
/*
 *线程间通讯--生产者和消费者
 *需求：
 *	生产者生成产品，消费者购买产品，生产和购买一一对应
 */
class Res2{
	private String name;
	private int count;
	private boolean flag=false;
	public synchronized void set(String name){
		while(flag){
			try{wait();}catch(Exception e){}
		}
		this.name=name+"::"+count++;
			
		System.out.println(Thread.currentThread().
			getName()+"生产者"+this.name);
		flag=true;
		this.notifyAll();
		
	}
	public synchronized void get(String name){
		while(!flag){
			try{wait();}catch(Exception e){}
		}
		System.out.println(Thread.currentThread().getName()+":::消费者:"+this.name);
		flag=false;
		this.notifyAll();		
	}
}
class Produce implements Runnable{
	private Res2 r;
	Produce(Res2 r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.set("煎饼");
		}
	}
}
class Consumer implements Runnable{
	private Res2 r;
	Consumer(Res2 r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.get("煎饼");
		}
	}
}
public class ProduceThread {

	public static void main(String[] args) {
		Res2 r = new Res2();
		Produce p = new Produce(r);
		Consumer c = new Consumer(r);
		
		new Thread(p).start();
		new Thread(c).start();
		new Thread(p).start();
		new Thread(c).start();
	}

}
