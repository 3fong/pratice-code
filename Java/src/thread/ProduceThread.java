package thread;
/*
 *�̼߳�ͨѶ--�����ߺ�������
 *����
 *	���������ɲ�Ʒ�������߹����Ʒ�������͹���һһ��Ӧ
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
			getName()+"������"+this.name);
		flag=true;
		this.notifyAll();
		
	}
	public synchronized void get(String name){
		while(!flag){
			try{wait();}catch(Exception e){}
		}
		System.out.println(Thread.currentThread().getName()+":::������:"+this.name);
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
			r.set("���");
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
			r.get("���");
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
