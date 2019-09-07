package test33;
/*
 *ģ��һ����վ��Ʊ����,����5������,��Ҫ���߳����.
 */
class Subway implements Runnable{
	private int ticket = 1000;
	private Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				if(ticket>0){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {						
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread()
							.getName()+":���۵ڣ�"+(ticket--)+"��Ʊ");
				}
			}
		}
	}
}
public class T26SallTicketDemo {

	public static void main(String[] args) {
		Subway sub = new Subway();
		
		Thread t1 = new Thread(sub,"������վ");
		Thread t2 = new Thread(sub,"����վ");
		Thread t3 = new Thread(sub,"����------��վ");
		Thread t4 = new Thread(sub,"����###��վ");
		Thread t5 = new Thread(sub,"��վ");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
