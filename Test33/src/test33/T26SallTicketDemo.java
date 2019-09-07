package test33;
/*
 *模拟一个火车站卖票程序,需求5个窗口,需要多线程完成.
 */
class Subway implements Runnable{
	private int ticket = 1000;
	private Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				if(ticket>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread()
							.getName()+":在售第："+(ticket--)+"张票");
				}
			}
		}
	}
}
public class T26SallTicketDemo {

	public static void main(String[] args) {
		Subway sub = new Subway();
		
		Thread t1 = new Thread(sub,"北京西站");
		Thread t2 = new Thread(sub,"北京站");
		Thread t3 = new Thread(sub,"北京------南站");
		Thread t4 = new Thread(sub,"北京###北站");
		Thread t5 = new Thread(sub,"老站");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
