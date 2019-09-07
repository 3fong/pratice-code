package thread;

//卖票程序，用静态使票成为共享数据。这种方法较浪费资源，因为静态寿命太长。

class Ticket extends Thread{
	private static int tick = 100;
	public void run(){
		while(true){
			if(tick>0)
				System.out.println(this.getName()+".."+tick--);
		}
	}
}
public class TicketDemo {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
