package threadGroup;
/*
 *
 * �߳��飺 �Ѷ���߳���ϵ�һ��
 * �����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳�����п��ơ�
 * public final ThreadGroup getThreadGroup():��ȡ�߳���
 */
public class GroupDemo {

	public static void main(String[] args) {
//		method1();
		method2();
		
		for(int x=0;x<5;x++){
			System.out.println(Thread.currentThread().getName()+x);
		}
	}
	//���������Ч�������������е��߳�
	private static void method2() {
		ThreadGroup tg = new ThreadGroup("����");
		
		MyRunnable mr = new MyRunnable();
		
		//Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg,mr,"����ϼ");
		Thread t2 = new Thread(tg,mr,"����");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		tg.setDaemon(true);
		t1.start();
		t2.start();
	}

	private static void method1() {
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(mr,"����ϼ");
		Thread t2 = new Thread(mr,"����");
		
		//��ȡ�߳���
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		//��ȡ�߳�������
		String n1 = tg1.getName();
		String n2 = tg2.getName();
		System.out.println(n1);
		System.out.println(n2);
		
		//Ĭ������£������̶߳�����ͬһ�飺main
		System.out.println(Thread.currentThread().getThreadGroup().getName());
//		t1.start();
//		t2.start();
	}

}
