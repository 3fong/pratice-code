package ticketSynStatic;
/*
 *�����߳����� 
 *	ͬ����������ԭ�� ���Կ����ϲ���
 */
public class Ticket implements Runnable {
	//��Ϊ��̬������Ҫʹ�ó�Ա����������Ҫ����Ա�������뾲̬
	private static int ticket=100;
	Object o = new Object();
	private int x=0;
	public void run(){
		while(true){
			if(x%2==0){
				//ͬ������������������󣬵���Ҫ������ͬ����ʽһ��ʹ��ʱҪ��֤����һ����
				synchronized(Ticket.class){
					if(ticket>0){
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {					
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+":���۵ڣ�"+(ticket--)+"��Ʊ");
					}
				}
			}else{
				sellTicket();
			}
			x++;
		}
	}
	//ͬ������������this
//	private synchronized void sellTicket() {
//		if(ticket>0){
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {				
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+":���۵ڣ�"+(ticket--)+"��Ʊ");
//		}
//	}
	//��̬ͬ�������������ֽ����ļ�
	private static synchronized void sellTicket() {
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
