package thread;
/*
 *���󣺼򵥵���Ʊ����  �ര��ʵ��
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
							getName()+":���۵�"+(ticket--)+"��Ʊ");
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
				getName()+":���۵�"+(ticket--)+"��Ʊ");
		}
	}
}
public class ThreadSellDemo {
	public static void main(String[] args) {
		Sell s = new Sell();
		Thread t1 = new Thread(s,"С��");
		Thread t2 = new Thread(s,"�������");
		t1.start();
		s.flag=true;
		t2.start();
	}
}
