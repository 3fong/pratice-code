package ticketRunnable;
/*
 *
 */
public class Ticket implements Runnable {
	private int ticket=100;
	public void run(){
		while(true){
			if(ticket>0){
				System.out.println(Thread.currentThread().getName()+":���۵ڣ�"+(ticket--)+"��Ʊ");
			}
		}
	}
}
