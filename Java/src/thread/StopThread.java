package thread;
/*
 *�̵߳�ֹͣ�����ַ�ʽ��
 *1 ��run��������������������ѭ������Ϊ�̶߳���ѭ���ṹ��2 ���������interrupt()�� 
	interrupt()����ֹ�̡߳������ڶ���״̬���ж�״̬�����̣߳�ǿ�ƻָ�������״̬������
	ע�⣺�ж�״̬����ֹͣ״̬��stop����
 */
class StopRun implements Runnable{
	private boolean flag = true;
	public synchronized void run(){
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {				
				System.out.println(Thread.currentThread().getName()+"InterruptedException");
				flag = false;
			}
			System.out.println(Thread.currentThread().getName()+"over run");
		}
	}
	public void changeFlag(){
		flag=false;
	}
}
public class StopThread {

	public static void main(String[] args) {
		StopRun sr = new StopRun();
		Thread t1 = new Thread(sr,"pao");
		Thread t2 = new Thread(sr,"xiaozhu");
		t1.start();
		t2.start();
		
		int num=0;
		while(true){
			if(num++==30){
				//�������ÿ���ѭ�������ķ�ʽ���ڲ���ʹ�á�
//				sr.changeFlag();
				t1.interrupt();
				t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"run:"+num);
		}
		System.out.println("over");
	}
}
