package others;
/*
 *
 */
public class ThreadYield extends Thread{
	public void run(){
		for(int x=0;x<10;x++){
			System.out.println(getName()+": "+x);
			Thread.yield();
		}
	}
}
