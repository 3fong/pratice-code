package lock;
/*
 *ͬ���ı׶ˣ�
 * 		A:Ч�ʵ�
 * 		B:���ײ�������
 * ������
 * 		�������������ϵ��߳���������Դ�Ĺ����У�������һ���໥�ȴ�������
 */
public class DieLockDemo {

	public static void main(String[] args) {
		DieLock d1 = new DieLock(true);
		DieLock d2 = new DieLock(false);
//		Thread t1 = new Thread(d,"true");
//		Thread t2 = new Thread(d,"false");
		
		d1.start();
		d2.start();
	}

}
