package thread;
/*
 *继承Thread类，创建多线程
 */
public class MyThread extends Thread {	
	public MyThread() {	
	}
	public MyThread(String name) {
		super(name);		
	}

	public void run(){
		for(int x=0;x<15;x++){
			//public final String getName():获取线程的名称。
			System.out.println(getName()+": "+x);			
		}
	}
}
