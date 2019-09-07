package timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 *定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情。
 * 依赖Timer和TimerTask这两个类：
 * Timer:定时
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel()
 * TimerTask:任务
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
		System.out.println("炸弹");
		t.cancel();
	}
}