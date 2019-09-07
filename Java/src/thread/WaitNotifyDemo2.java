package thread;
/*
 *优化线程间通信代码
 *	synchronized定义在方法上，锁是this。
 */
class Res1{
	private String name;
	private int age;
	private boolean flag=false;
	public synchronized void set(String name,int age){
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		this.name=name;
		this.age=age;
		flag=true;
		this.notify();
	}
	public synchronized void get(){
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		System.out.println(name+":"+age);
		flag=false;
		this.notify();
	}
}
class Input1 implements Runnable{
	private Res1 r;
	Input1(Res1 r){
		this.r=r;
	}	
	public void run(){
		int x=0;
		while(true){
			if(x%2==0)
				r.set("zhangsan",27);
			else
				r.set("张无忌",9);
			x++;
		}
	}
}
class Output1 implements Runnable{
	private Res1 r;
	Output1(Res1 r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.get();
		}
	}
}
public class WaitNotifyDemo2 {

	public static void main(String[] args) {
		Res1 r = new Res1();
		Input1 i = new Input1(r);
		Output1 o = new Output1(r);
		
		new Thread(i).start();
		new Thread(o).start();
	}

}
