package ticketThread;
/*
 *
 */
public class Ticket extends Thread {
	//将成员变量设置为静态，已达到数据共享效果 缺点：静态寿命太长
	private static int ticket = 100;
	public void run(){
		//定义100张票。在这里定义，因为有三个线程，相当于定义了三个100张票
//		int ticket = 100;
		while(true){
			if(ticket>0){
				System.out.println(getName()+":在售第"+(ticket--)+"张票");
			}
		}
	}
}
