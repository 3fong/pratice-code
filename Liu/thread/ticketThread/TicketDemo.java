package ticketThread;
/*
 *ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���ؾ���)������100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
 * �̳�Thread����ʵ�֡�
 */
public class TicketDemo {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		
		t1.setName("ó");
		t2.setName("ֱ��");
		t3.setName("����ƥ��");
		t1.start();
		t2.start();
		t3.start();
	}

}
