package thread;

import java.util.Timer;
import java.util.TimerTask;

/*
 *定时器：可以让我们在指定的时间做某件事情，还可以重复的做某件事情。
 * 依赖Timer和TimerTask这两个类：
 * Timer:定时
 * 		public Timer()
 * 		public void schedule(TimerTask task,long delay)
 * 		public void schedule(TimerTask task,long delay,long period)
 * 		public void cancel():结束任务
 * TimerTask:任务，需要被继承
 */
//接收Timer对象，运行指定任务
class MyTimer extends TimerTask{
	private Timer t;	
	public MyTimer(){}
	public MyTimer(Timer t) {
		super();
		this.t = t;
	}
	@Override
	public void run() {
		System.out.println("嘣，吓死了");
//		t.cancel();
	}
	
}
public class TimerDemo {

	public static void main(String[] args) {
		Timer t = new Timer();
		MyTimer mt = new MyTimer(t);
		
		//两秒后执行任务，定时功能
		//NullPointerException没有接收对象，无法调用其结束方法
//		t.schedule(new MyTimer(), 2000);
//		t.schedule(mt,2000);
		//public void schedule(TimerTask task,long delay,long period)
		//间隔2秒再次调用此方法，连环炸弹 注意：调用方法中，不能有cancel()，不能和非连环方法同时使用
		t.schedule(mt,2000,2000);
	}

}
