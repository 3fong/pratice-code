package ticketSynchronised;
/*
 *������ʱ�����������⣬
 *���߳̿��ܲ����������أ�
 * A:�Ƿ��Ƕ��̻߳���
 * B:�Ƿ��й�������
 * C:�Ƿ��ж�����������������
 * ����������أ�����ֻ�ܸı�C��java�ṩ��ͬ�����ƽ�����ݹ�������
 *ͬ������飺
 * 		synchronized(����){
 * 			��Ҫͬ���Ĵ���;(��������)
 * 		}
 * 	ע�⣺
 * 		ͬ�����Խ����ȫ����ĸ���ԭ������Ǹ������ϡ��ö�����ͬ���Ĺ��ܡ�
 * 		����̱߳�����ͬһ����
 * ͬ���ļ�������Ըо��������ٶȵĽ��͡���ȫ��Ч���ǳ���Ա���������⡣
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
