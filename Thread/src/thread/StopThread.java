package thread;
//interrupt:强行恢复运行状态
class Sthread implements Runnable{
	private boolean flag=true;
	public synchronized void run(){
		while(flag){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println(Thread.currentThread().getName()+"Exception");
				flag=false;
			}
			System.out.println(Thread.currentThread().getName()+"run");
		}
	}
//	public void changeFlag(){
//		flag=false;
//	}
}
public class StopThread {

	public static void main(String[] args) {
		Sthread s = new Sthread();
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		
		int num=0;
		while(true){
			if(num++==60){
//				try{Thread.sleep(10);}catch(Exception e){}
//				s.changeFlag();
//				t1.interrupt();
//				t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+num);			
		}
	}

}
