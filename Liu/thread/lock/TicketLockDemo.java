package lock;
/*
 *��Ȼ���ǿ������ͬ��������ͬ�����������������⣬�������ǲ�û��ֱ�ӿ�������������������������ͷ�������
 * Ϊ�˸������ı����μ������ͷ���,JDK5�Ժ��ṩ��һ���µ�������Lock��
 * 
 * Lock��
 * 		void lock()�� ��ȡ����
 * 		void unlock():�ͷ�����  
 * ReentrantLock��Lock��ʵ����.
 * Lock lock = new ReentrantLock();
 */
public class TicketLockDemo {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		Thread t1 = new Thread(t,"��");
		Thread t2 = new Thread(t,"������");
		t1.start();
		t2.start();
	}

}
