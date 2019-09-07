package timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 *��ʱ����������������ָ����ʱ����ĳ�����飬�������ظ�����ĳ�����顣
 * ����Timer��TimerTask�������ࣺ
 * Timer:��ʱ
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * TimerTask:����
 */
public class TimerDemo {

	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new MyTimer(),2000);
		t.schedule(new MyTimer(t),2000);
	}
}
class MyTimer extends TimerTask{
	private Timer t;
	public MyTimer(){}
	public MyTimer(Timer t) {
		super();
		this.t = t;
	}
	public void run(){
		System.out.println("ը��");
		t.cancel();
	}
}