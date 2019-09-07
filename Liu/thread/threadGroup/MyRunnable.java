package threadGroup;
/*
 *
 */
public class MyRunnable implements Runnable {
	public void run(){
		for(int x=0;x<150;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
