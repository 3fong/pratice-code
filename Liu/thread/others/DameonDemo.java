package others;
/*
 *public final void setDaemon(boolean on):�����̱߳��Ϊ�ػ��̻߳��û��̡߳�
 * ���������е��̶߳����ػ��߳�ʱ��Java ������˳��� �÷��������������߳�ǰ����
 */
public class DameonDemo {

	public static void main(String[] args) {
		Dameon d1 = new Dameon("���Ƴ�");
		Dameon d2 = new Dameon("��");
		
		//������ǰ���ã�����Ҫ�����߳�
		d1.setDaemon(true);
		d2.setDaemon(true);
		d1.start();
		d2.start();
		
		Thread.currentThread().setName("����");
		for(int x=0;x<5;x++){
			System.out.println(Thread.currentThread().getName()+": "+x);
		}
	}

}
