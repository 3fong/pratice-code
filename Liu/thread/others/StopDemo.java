package others;
/*
 *public final void stop():让线程停止，过时了，但是还可以使用。
 * public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
 */
public class StopDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadStop ts = new ThreadStop();
		ts.start();
		Thread.sleep(3000);
		ts.interrupt();
//		ts.stop();
	}

}
