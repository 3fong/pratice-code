package thread;
/*
 * �̵߳ķ�����
 *join()�������̡߳��൱�ڲ�ӡ����ã�������ʱ�����߳�ִ�С�
 *yield():�����̡߳���ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳�
 *���ȼ���������cpu��Դ��Ƶ�ʡ� setPriority():�����߳����ȼ���
 *	MAX_PRIORITY MIN_PRIORITY NORM_PRIORITY
 *setDaemon():��̨�̡߳������������߳�ǰ���á����߳̽�������Ҳ������
 */
class Method implements Runnable{
	public void run(){
		for(int x=0;x<50;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
//			Thread.yield();
		}
	}
}
public class ThreadMethod {

	public static void main(String[] args) throws InterruptedException {
		Method m = new Method();
		Thread t1 = new Thread(m,"�Ű�");
		Thread t2 = new Thread(m,"��С��");
		Thread t3 = new Thread(m,"˾��---ʦ");
//		t1.setPriority(Thread.MIN_PRIORITY);
//		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
//		t1.join();
		t2.start();
		t3.start();
		
		Thread.currentThread().setName("��ɽ������");
		for(int x=0;x<4;x++){
			System.out.println(Thread.currentThread().getName()+"---"+x);
		}
	}

}
