package thread;
/*
 *线程的停止有两种方式：
 *1 让run方法结束；方法：控制循环。因为线程都是循环结构；2 特殊情况：interrupt()。 
	interrupt()：终止线程。将处于冻结状态（中断状态）的线程，强制恢复到运行状态中来。
	注意：中断状态不是停止状态（stop）。
 */
class StopRun implements Runnable{
	private boolean flag = true;
	public synchronized void run(){
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {				
				System.out.println(Thread.currentThread().getName()+"InterruptedException");
				flag = false;
			}
			System.out.println(Thread.currentThread().getName()+"over run");
		}
	}
	public void changeFlag(){
		flag=false;
	}
}
public class StopThread {

	public static void main(String[] args) {
		StopRun sr = new StopRun();
		Thread t1 = new Thread(sr,"pao");
		Thread t2 = new Thread(sr,"xiaozhu");
		t1.start();
		t2.start();
		
		int num=0;
		while(true){
			if(num++==30){
				//正常的用控制循环结束的方式现在不能使用。
//				sr.changeFlag();
				t1.interrupt();
				t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"run:"+num);
		}
		System.out.println("over");
	}
}
