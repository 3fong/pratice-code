package test;
/*
 *
 */
class X extends Thread implements Runnable{
	public void run(){
		System.out.println("run()");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = new Thread(new X());
		t.start();
		double a = 1.0;
		System.out.println(a);
		byte b = (byte)340;
		System.out.println(b);
		Byte c = 120;
		System.out.println(c);
		Double d = new Double(1.0);
		System.out.println(d);
	}

}
