package thread;
//生产者、消费者程序

class Resource{
	private String name;
	private int count;
	private boolean flag=false;
	public synchronized void get(String name){
		while(flag)
			try{wait();}catch(Exception e){}
		this.name=name+"..."+count++;
		System.out.println(Thread.currentThread().getName()+"..生产者.."+name);
		flag=true;
		this.notifyAll();
	}
	public synchronized void out(){
		while(!flag)
			try{wait();}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+name+"消费者");
		flag=false;
		this.notifyAll();
	}
}
class Productor implements Runnable{
	private Resource r;
	Productor(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.get("商品");
		}
	}
}
class Consumer implements Runnable{
	private Resource r;
	Consumer(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.out();
		}
	}
}
public class ProConDemo {

	public static void main(String[] args) {
		Resource r = new Resource();
		
		new Thread(new Productor(r)).start();
		new Thread(new Consumer(r)).start();
		new Thread(new Productor(r)).start();
		new Thread(new Consumer(r)).start();
	}

}
