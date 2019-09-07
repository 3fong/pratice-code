package thread;
//卖票程序2，用实现Runnable方法。优点：避免了单线程的局限性

class Piao implements Runnable{
	private int tick = 100;
	Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				if(tick>0){
					try{Thread.sleep(10);}catch(Exception e){}
					System.out.println(Thread.currentThread().getName()+"..."+tick--);
				}
			}
		}
	}
}
public class TicketDemo2 {

	public static void main(String[] args) {
		Piao t = new Piao();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
