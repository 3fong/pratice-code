package ticketThread;
/*
 *
 */
public class Ticket extends Thread {
	//����Ա��������Ϊ��̬���Ѵﵽ���ݹ���Ч�� ȱ�㣺��̬����̫��
	private static int ticket = 100;
	public void run(){
		//����100��Ʊ�������ﶨ�壬��Ϊ�������̣߳��൱�ڶ���������100��Ʊ
//		int ticket = 100;
		while(true){
			if(ticket>0){
				System.out.println(getName()+":���۵�"+(ticket--)+"��Ʊ");
			}
		}
	}
}
