package others;
/*
 *public final void join():�ȴ����߳���ֹ��
 */
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Dameon d1 = new Dameon("��Ԩ");
		Dameon d2 = new Dameon("������");
		Dameon d3 = new Dameon("����");
		
		d1.start();
		d1.join();
		d2.start();
		d3.start();
		
	}
}
