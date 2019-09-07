package thread;
/*
 *需求：简单的卖票程序  多窗口实现
 */
class Sell implements Runnable{
	private int ticket = 100;
	boolean flag = false;
	public void run(){
		if(flag){
			while(true){
				synchronized(this){
					if(ticket>0){
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {				
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().
							getName()+":在售第"+(ticket--)+"张票");
					}
				}
			}
		}else{
			while(true){
				show();
			}
		}
	}
	public synchronized void show(){
		if(ticket>0){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().
				getName()+":在售第"+(ticket--)+"张票");
		}
	}
}
public class ThreadSellDemo {
	public static void main(String[] args) {
		Sell s = new Sell();
		Thread t1 = new Thread(s,"小花");
		Thread t2 = new Thread(s,"吴国大乔");
		t1.start();
		s.flag=true;
		t2.start();
	}
}
