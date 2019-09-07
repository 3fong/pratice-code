package others;

import java.util.Date;

/*
 *
 */
public class ThreadStop extends Thread {
	public void run(){			
		System.out.println("日期："+new Date());
		try {
			//线程休眠
			Thread.sleep(10000);
		} catch (InterruptedException e) {				
//				e.printStackTrace();
			System.out.println("线程中断异常");
		}
		System.out.println("程序结束"+new Date());
	}
}
