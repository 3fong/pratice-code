package thread;
/*
 *�߳��飺 �Ѷ���߳���ϵ�һ��
 * �����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳�����п��ơ�
 * public final ThreadGroup getThreadGroup():��ȡ�߳���
 * Ĭ������£������̶߳�����ͬһ�飺main
 */
class MyRunnable implements Runnable {
	public void run(){
		for(int x=0;x<150;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
public class ThreadGroupDemo {

	public static void main(String[] args) {		
		method1();
		for(int x=0;x<4;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
	private static void method1() {
		ThreadGroup tg = new ThreadGroup("����");
		MyRunnable mr = new MyRunnable();
		//Thread(ThreadGroup group, Runnable target, String name)
		Thread t1 = new Thread(tg,mr,"Linqingxia");
		Thread t2 = new Thread(tg,mr,"�����");
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		tg.setDaemon(true);
		t1.start();
		t2.start();
	}
}
