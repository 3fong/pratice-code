package thread;

import java.util.Timer;
import java.util.TimerTask;

/*
 *��ʱ����������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ�����顣
 * ����Timer��TimerTask�������ࣺ
 * Timer:��ʱ
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel():��������
 * TimerTask:������Ҫ���̳�
 */
//����Timer��������ָ������
class MyTimer extends TimerTask{
	private Timer t;	
	public MyTimer(){}
	public MyTimer(Timer t) {
		super();
		this.t = t;
	}
	@Override
	public void run() {
		System.out.println("�ԣ�������");
//		t.cancel();
	}
	
}
public class TimerDemo {

	public static void main(String[] args) {
		Timer t = new Timer();
		MyTimer mt = new MyTimer(t);
		
		//�����ִ�����񣬶�ʱ����
		//NullPointerExceptionû�н��ն����޷��������������
//		t.schedule(new MyTimer(), 2000);
//		t.schedule(mt,2000);
		//public void schedule(TimerTask task,long delay,long period)
		//���2���ٴε��ô˷���������ը�� ע�⣺���÷����У�������cancel()�����ܺͷ���������ͬʱʹ��
		t.schedule(mt,2000,2000);
	}

}
