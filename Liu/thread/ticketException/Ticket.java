package ticketException;
/*
 *�����߳�����
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
				System.out.println(Thread.currentThread().getName()+":���۵ڣ�"+(ticket--)+"��Ʊ");
			}
		}
	}
}
