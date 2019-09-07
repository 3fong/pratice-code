package timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 *public void schedule(TimerTask task,long delay,long period)
 */
public class TimerDemo2 {

	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new MyTask(),2000,2000);
	}

}
class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("Ô­×Óµ¯");
	}
	
}