package ticketException;
/*
 *ʵ��Runnable�ӿڵķ���
 *	�����߳����ߺ���������⣺
 *A:��ͬ��Ʊ���˶��
 * 		CPU��һ�β���������ԭ���Ե�
 * B:�����˸���Ʊ
 * 		����Ժ��ӳٵ��µ�
 */
public class TikcetRunnableDemo {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t,"ó");
		Thread t2 = new Thread(t,"ֱ��");
		Thread t3 = new Thread(t,"����ƥ��");
		t1.start();
		t2.start();
		t3.start();
	}

}
