package others;
/*
 *public final void join():等待该线程终止。
 */
public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Dameon d1 = new Dameon("李渊");
		Dameon d2 = new Dameon("李世民");
		Dameon d3 = new Dameon("建成");
		
		d1.start();
		d1.join();
		d2.start();
		d3.start();
		
	}
}
