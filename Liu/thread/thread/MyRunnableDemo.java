package thread;
/*
 *�����̵߳ڶ��ַ�ʽ��ʵ��Runnable�ӿ�
 * ���裺
 * 		A:�Զ�����MyRunnableʵ��Runnable�ӿ�
 * 		B:��дrun()����
 * 		C:����MyRunnable��Ķ���
 * 		D:����Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
 */
public class MyRunnableDemo {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		
		//Thread(Runnable target, String name)�������ڲ����б���������
		Thread t1 = new Thread(mr,"�����");
		Thread t2 = new Thread(mr,"��");
		t1.start();
		t2.start();
	}

}
