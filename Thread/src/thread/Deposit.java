package thread;

//银行存款问题。同步函数

class Bank{
	private int sum=0;
	public synchronized void add(int n){
		sum=sum+n;
			try{Thread.sleep(10);}catch(Exception e){}
		System.out.println("sum= "+sum);
	}
} 
class Cus implements Runnable{
	private Bank b = new Bank();
	public void run(){
		for(int x=0;x<3;x++){
			b.add(100);
		}
	}
}
public class Deposit {

	public static void main(String[] args) {
		Cus c = new Cus();
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}
