package others;

import java.util.Date;

/*
 *
 */
public class ThreadStop extends Thread {
	public void run(){			
		System.out.println("���ڣ�"+new Date());
		try {
			//�߳�����
			Thread.sleep(10000);
		} catch (InterruptedException e) {				
//				e.printStackTrace();
			System.out.println("�߳��ж��쳣");
		}
		System.out.println("�������"+new Date());
	}
}
