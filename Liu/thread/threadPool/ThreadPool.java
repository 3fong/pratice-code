package threadPool;
/*
 *
 */
public class ThreadPool implements Runnable {
	public void run(){
		for(int x=0;x<20;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
