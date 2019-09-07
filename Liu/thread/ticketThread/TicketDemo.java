package ticketThread;
/*
 *某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 * 继承Thread类来实现。
 */
public class TicketDemo {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		
		t1.setName("贸");
		t2.setName("直门");
		t3.setName("奥林匹克");
		t1.start();
		t2.start();
		t3.start();
	}

}
