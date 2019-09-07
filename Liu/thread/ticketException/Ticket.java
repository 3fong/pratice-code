package ticketException;
/*
 *加入线程休眠
 */
public class Ticket implements Runnable {
	private int ticket=100;
	public void run(){
		while(true){
			if(ticket>0){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":在售第："+(ticket--)+"张票");
			}
		}
	}
}
