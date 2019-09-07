package thread;
/*
 *银行存款问题
 */
class Bank {
	private int sum=0;
	public synchronized void add(int n) {
		sum+=n;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}
}
class Guess implements Runnable{
	private Bank b = new Bank();
	public void run(){
		for(int x=0;x<3;x++){
			b.add(100);
		}
	}
}
public class BankThreadDemo {

	public static void main(String[] args) {
		Guess g = new Guess();
		Thread t1 = new Thread(g,"海淀小霸王");
		Thread t2 = new Thread(g,"虞姬");
		t1.start();
		t2.start();
	}
}
