package thread;

//同步函数锁是this。
class Ticket2 implements Runnable{
	private int tick=100;
	boolean flag=true;
	public void run(){
		if(flag){
			while(true){
				synchronized(this){
					if(tick>0){
						try{Thread.sleep(10);}catch(Exception e){}
						System.out.println(Thread.currentThread().getName()+"sale"+tick--);
					}
				}
			}
		}
		else{
			while(true)
				show();
		}
	}
	public synchronized void show(){
		if(tick>0){
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+".code."+tick--);
		}
	}
}
public class TicketThis {

	public static void main(String[] args) {
		Ticket2 t = new Ticket2();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag=false;		
		t2.start();
	}

}
