package others;

import java.util.Date;

/*
 *
 */
public class Sleep extends Thread{	
	public void run(){
		for(int x=0;x<30;x++){				
			System.out.println(getName()+": "+x+"���ڣ�"+new Date());
			try {
				//�߳�����
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
