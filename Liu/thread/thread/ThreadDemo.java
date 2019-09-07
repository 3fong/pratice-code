package thread;
/*
 *�����̷߳�ʽһ���̳�Thread��
 *		1 �̳�Thread��
 *		2 ��дrun����
 *		3 ��������
 *		4 ����start����
 * ��λ�ȡ�̶߳����������?
 * public final String getName():��ȡ�̵߳����ơ�
 * ��������̶߳����������?
 * ����һ��public final void setName(String name):�����̵߳�����
 * �����������캯��
 * ��Բ���Thread�����������λ�ȡ�̶߳���������?
 * public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
 * Thread.currentThread().getName()
 */
public class ThreadDemo {

	public static void main(String[] args) {
//		MyThread mt1 = new MyThread();
//		MyThread mt2 = new MyThread();
//		
//		mt1.setName("�ܲ�");
//		mt2.setName("��Ȩ");
		
		MyThread mt1 = new MyThread("�ܲ�");
		MyThread mt2 = new MyThread("��Ȩ");
		mt1.start();
		mt2.start();
		
		for(int x=0;x<10;x++){
			//public static Thread currentThread():���ص�ǰ����ִ�е��̶߳���
			System.out.println(Thread.currentThread().getName()+": "+x);
		}
	}

}
