package thread;
/*
 *�̳�Thread�࣬�������߳�
 */
public class MyThread extends Thread {	
	public MyThread() {	
	}
	public MyThread(String name) {
		super(name);		
	}

	public void run(){
		for(int x=0;x<15;x++){
			//public final String getName():��ȡ�̵߳����ơ�
			System.out.println(getName()+": "+x);			
		}
	}
}
